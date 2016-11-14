
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ResultGuest_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class ResultGuest extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Result Page</title>
</head>
<body>

  <form method="GET" action="">



  </form>

</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object ResultGuest extends ResultGuest_Scope0.ResultGuest
              /*
                  -- GENERATED --
                  DATE: Thu Jul 21 21:52:09 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/ResultGuest.scala.html
                  HASH: 5dd93e0c669ed3fbc3bbe02354bba1d7118966d0
                  MATRIX: 839->0
                  LINES: 32->1
                  -- GENERATED --
              */
          