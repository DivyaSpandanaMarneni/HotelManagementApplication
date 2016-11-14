
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object AdminValidation_Scope0 {
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

class AdminValidation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>2 Column Layout — Right Menu with Header &amp; Footer</title>
    <style type="text/css">
    ul """),format.raw/*6.8*/("""{"""),format.raw/*6.9*/("""
      """),format.raw/*7.7*/("""list-style-type: none;
      margin: 0;
      padding: 0;
      overflow: hidden;
      background-color: #333;
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""

    """),format.raw/*14.5*/("""li """),format.raw/*14.8*/("""{"""),format.raw/*14.9*/("""
      """),format.raw/*15.7*/("""float: left;
    """),format.raw/*16.5*/("""}"""),format.raw/*16.6*/("""

    """),format.raw/*18.5*/("""li a """),format.raw/*18.10*/("""{"""),format.raw/*18.11*/("""
      """),format.raw/*19.7*/("""display: block;
      color: white;
      text-align: center;
      padding: 14px 16px;
      text-decoration: none;
    """),format.raw/*24.5*/("""}"""),format.raw/*24.6*/("""

    """),format.raw/*26.5*/("""li a:hover """),format.raw/*26.16*/("""{"""),format.raw/*26.17*/("""
      """),format.raw/*27.7*/("""background-color: #111;
    """),format.raw/*28.5*/("""}"""),format.raw/*28.6*/("""
    """),format.raw/*29.5*/("""body """),format.raw/*29.10*/("""{"""),format.raw/*29.11*/("""
      """),format.raw/*30.7*/("""margin:0;
      padding:0;
      font-family: Sans-Serif;
      line-height: 1.5em;
    """),format.raw/*34.5*/("""}"""),format.raw/*34.6*/("""

    """),format.raw/*36.5*/("""header """),format.raw/*36.12*/("""{"""),format.raw/*36.13*/("""
      """),format.raw/*37.7*/("""background: #ccc;
      height: 100px;
      background-color: #00008B;
      background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/("""

    """),format.raw/*43.5*/("""header h1 """),format.raw/*43.15*/("""{"""),format.raw/*43.16*/("""
      """),format.raw/*44.7*/("""margin: 0;
      padding-top: 15px;
      background-color: #00008B;
      background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*48.5*/("""}"""),format.raw/*48.6*/("""

    """),format.raw/*50.5*/("""main """),format.raw/*50.10*/("""{"""),format.raw/*50.11*/("""
      """),format.raw/*51.7*/("""padding-bottom: 10010px;
      margin-bottom: -10000px;
      float: left;
      width: 100%;
      background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*56.5*/("""}"""),format.raw/*56.6*/("""
    """),format.raw/*57.5*/("""nav """),format.raw/*57.9*/("""{"""),format.raw/*57.10*/("""
      """),format.raw/*58.7*/("""padding-bottom: 10010px;
      margin-bottom: -10000px;
      float: left;
      width: 230px;
      margin-left: -230px;
      background: #eee;
    """),format.raw/*64.5*/("""}"""),format.raw/*64.6*/("""

    """),format.raw/*66.5*/("""footer """),format.raw/*66.12*/("""{"""),format.raw/*66.13*/("""
      """),format.raw/*67.7*/("""clear: left;
      width: 100%;
      text-align: center;
      padding: 4px 0;
      background-color: #FFFFFF;
      text-color:#000000;
    """),format.raw/*73.5*/("""}"""),format.raw/*73.6*/("""


    """),format.raw/*76.5*/("""#wrapper """),format.raw/*76.14*/("""{"""),format.raw/*76.15*/("""
      """),format.raw/*77.7*/("""overflow: hidden;
    """),format.raw/*78.5*/("""}"""),format.raw/*78.6*/("""

    """),format.raw/*80.5*/("""#content """),format.raw/*80.14*/("""{"""),format.raw/*80.15*/("""
      """),format.raw/*81.7*/("""margin-right: 230px; /* Same as 'nav' width */
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/("""

    """),format.raw/*84.5*/(""".innertube """),format.raw/*84.16*/("""{"""),format.raw/*84.17*/("""
      """),format.raw/*85.7*/("""margin: 15px; /* Padding for content */
      margin-top: 0;
      background-color: #FFFFFF;
      text-color:#000000;
    """),format.raw/*89.5*/("""}"""),format.raw/*89.6*/("""

    """),format.raw/*91.5*/("""p """),format.raw/*91.7*/("""{"""),format.raw/*91.8*/("""
      """),format.raw/*92.7*/("""color: #555;
    """),format.raw/*93.5*/("""}"""),format.raw/*93.6*/("""

    """),format.raw/*95.5*/("""nav ul """),format.raw/*95.12*/("""{"""),format.raw/*95.13*/("""
      """),format.raw/*96.7*/("""list-style-type: none;
      margin: 0;
      padding: 0;
    """),format.raw/*99.5*/("""}"""),format.raw/*99.6*/("""

    """),format.raw/*101.5*/("""nav ul a """),format.raw/*101.14*/("""{"""),format.raw/*101.15*/("""
      """),format.raw/*102.7*/("""color: darkgreen;
      text-decoration: none;
    """),format.raw/*104.5*/("""}"""),format.raw/*104.6*/("""

    """),format.raw/*106.5*/("""</style>
  </head>
  <body>

    <div align="center" >
      <h1><a> Hotel Management System</a></h1>
    </div>


    <ul>
      <li><a class="active" href=""""),_display_(/*116.36*/routes/*116.42*/.RedirectionController.redirectHome()),format.raw/*116.79*/("""">Home</a></li>
      <li><a href=""""),_display_(/*117.21*/routes/*117.27*/.RedirectionController.redirectGuest()),format.raw/*117.65*/("""">Guest</a></li>
      <li><a href=""""),_display_(/*118.21*/routes/*118.27*/.RedirectionController.redirectAdmin()),format.raw/*118.65*/("""">Admin</a></li>
    </ul>
    <div id="wrapper">
      <main>
        <h2>Enter Guest Id if you already have one. </h2>

        <form method="POST" action=""""),_display_(/*124.38*/routes/*124.44*/.AdminHomeController.checkAdmin()),format.raw/*124.77*/("""">
          <table>
            <tr>
              <td>Enter Admin Code:</td>
              <td><input type="password" name="txtAdminId"></td>
              <td><input type="submit" name="adminIdSubmit" value ="Submit"></td>
            </tr>
          </table>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>

          <br>
          <br>
          <br><br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br><br><br>
          <br>
          <br>
          <br>
          <br>
          <br>




        </form>




      </main>
    </div>

    <footer>
      <div class="innertube">
                Project Members : Sujeet Kulkarni, Chen Chen Jiahao Xu, Divya Marneni Lovina Dmello
      </div>
    </footer>


  </body></html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object AdminValidation extends AdminValidation_Scope0.AdminValidation
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 20:20:03 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/AdminValidation.scala.html
                  HASH: 545bda8c1c5e5e4471202df279a70b5234154547
                  MATRIX: 847->0|1074->201|1101->202|1135->210|1283->331|1311->332|1346->340|1376->343|1404->344|1439->352|1484->370|1512->371|1547->379|1580->384|1609->385|1644->393|1797->519|1825->520|1860->528|1899->539|1928->540|1963->548|2019->577|2047->578|2080->584|2113->589|2142->590|2177->598|2296->690|2324->691|2359->699|2394->706|2423->707|2458->715|2622->852|2650->853|2685->861|2723->871|2752->872|2787->880|2948->1014|2976->1015|3011->1023|3044->1028|3073->1029|3108->1037|3295->1197|3323->1198|3356->1204|3387->1208|3416->1209|3451->1217|3634->1373|3662->1374|3697->1382|3732->1389|3761->1390|3796->1398|3972->1547|4000->1548|4037->1558|4074->1567|4103->1568|4138->1576|4188->1599|4216->1600|4251->1608|4288->1617|4317->1618|4352->1626|4431->1678|4459->1679|4494->1687|4533->1698|4562->1699|4597->1707|4752->1835|4780->1836|4815->1844|4844->1846|4872->1847|4907->1855|4952->1873|4980->1874|5015->1882|5050->1889|5079->1890|5114->1898|5206->1963|5234->1964|5270->1972|5308->1981|5338->1982|5374->1990|5455->2043|5484->2044|5520->2052|5717->2221|5733->2227|5792->2264|5857->2301|5873->2307|5933->2345|5999->2383|6015->2389|6075->2427|6268->2592|6284->2598|6339->2631
                  LINES: 32->1|37->6|37->6|38->7|43->12|43->12|45->14|45->14|45->14|46->15|47->16|47->16|49->18|49->18|49->18|50->19|55->24|55->24|57->26|57->26|57->26|58->27|59->28|59->28|60->29|60->29|60->29|61->30|65->34|65->34|67->36|67->36|67->36|68->37|72->41|72->41|74->43|74->43|74->43|75->44|79->48|79->48|81->50|81->50|81->50|82->51|87->56|87->56|88->57|88->57|88->57|89->58|95->64|95->64|97->66|97->66|97->66|98->67|104->73|104->73|107->76|107->76|107->76|108->77|109->78|109->78|111->80|111->80|111->80|112->81|113->82|113->82|115->84|115->84|115->84|116->85|120->89|120->89|122->91|122->91|122->91|123->92|124->93|124->93|126->95|126->95|126->95|127->96|130->99|130->99|132->101|132->101|132->101|133->102|135->104|135->104|137->106|147->116|147->116|147->116|148->117|148->117|148->117|149->118|149->118|149->118|155->124|155->124|155->124
                  -- GENERATED --
              */
          