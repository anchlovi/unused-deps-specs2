package com.comp.b

import org.specs2.matcher.Matchers._
import org.specs2.matcher.{AlwaysMatcher, Matcher}

object Matchers {
    def personWith(age: Matcher[Int] = AlwaysMatcher(), name: Matcher[Option[String]] = AlwaysMatcher()): Matcher[Person] = {
        age ^^ ((_: Person).age aka "Age") and
          name ^^ ((_: Person).name aka "Name")
    }

    def personWithName(name: String): Matcher[Person] = {
        personWith(
            name = beSome(name)
        )
    }
}

