package models

import scala.concurrent.Future
import play.api.libs.json.JsObject

abstract class Analyzer {
  def analyze(artifact: Artifact): Future[JsObject]
  val name: String
  val version: String
  val description: String
  val dataTypeList: Seq[String]
  val author: String
  val url: String
  val license: String
  val id: String = (name + "_" + version).replaceAll("\\.", "_")
}
