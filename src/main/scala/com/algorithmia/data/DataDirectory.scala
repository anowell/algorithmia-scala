package com.algorithmia.data

import com.algorithmia._
import java.io.File

class DataDirectory(client: AlgorithmiaClient, dataUrl: String) extends DataObject(client, dataUrl, DataDirectoryType) {

  override def exists: Boolean = {
    ??? // TODO
  }

  def file(filename: String): DataFile = {
    new DataFile(client, trimmedPath + "/" + filename)
  }

  def putFile(file: File): DataFile = {
  	val dataFile = new DataFile(client, trimmedPath + "/" + file.getName)
  	dataFile.put(file)
  	dataFile
  }

}
