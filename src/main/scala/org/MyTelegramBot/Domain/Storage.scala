package org.MyTelegramBot.Domain

import org.MyTelegramBot.Domain.UserInfo._

trait Storage[T[_]] {
  def add(id: Id, event: Event): T[Unit]
  def remove(id: Id, event: Event): T[Unit]
  def getAll: T[List[(Id, List[Event])]]
  def get(id: Id): T[List[Event]]
}
