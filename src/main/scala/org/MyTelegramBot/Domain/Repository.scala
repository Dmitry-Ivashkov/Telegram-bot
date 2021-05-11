package org.MyTelegramBot.Domain

import org.MyTelegramBot.Domain.UserInfo._

trait Repository[T[_]] {
  def add(user: BotUser): T[Unit]
  def remove(event: Event): T[Unit]
  def getAll: T[List[BotUser]]
  def get(id: Id): T[Either[Throwable, BotUser]]
}
