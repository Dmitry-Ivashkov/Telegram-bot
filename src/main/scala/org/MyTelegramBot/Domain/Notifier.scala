package org.MyTelegramBot.Domain

import scala.collection.mutable

trait Follower {
  def update(event: Event): Unit
}

class Notifier() {
  private val followers: mutable.Set[(Follower, EventType)] = mutable.Set.empty

  def follow(follower: Follower, eType: EventType): Unit =
    followers.add((follower, eType))

  def unfollow(follower: Follower, eType: EventType): Unit =
    followers.remove((follower, eType))

  def notify(event: Event): Unit =
    followers.collect {
      case (follower, t) if t == event.eventType =>
        follower
    }.foreach { follower =>
      follower.update(event)
    }
}
