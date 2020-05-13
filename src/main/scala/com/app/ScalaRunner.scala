package com.app

import com.app.service.BooksProcessor
import com.app.storage.BookStorage

object ScalaRunner extends App {

  implicit val books = (new BookStorage()).getBooks

  BooksProcessor.filterByAuthor("Jack London").foreach(b => println(b))

}