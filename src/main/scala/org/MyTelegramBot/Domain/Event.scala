package org.MyTelegramBot.Domain

sealed trait EventType

object EventType {
  case object Lecture extends EventType
  case object Seminar extends EventType
  case object Homework extends EventType
}

trait Event {
  def eventType: EventType
}
