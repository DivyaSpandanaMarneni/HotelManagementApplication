
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object RoomTypeUpdateSuccess_Scope0 {
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

class RoomTypeUpdateSuccess extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>2 Column Layout &mdash; Right Menu with Header &amp; Footer</title>
    <style type="text/css">
    ul """),format.raw/*8.8*/("""{"""),format.raw/*8.9*/("""
      """),format.raw/*9.7*/("""list-style-type: none;
      margin: 0;
      padding: 0;
      overflow: hidden;
      background-color: #333;
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""

    """),format.raw/*16.5*/("""li """),format.raw/*16.8*/("""{"""),format.raw/*16.9*/("""
      """),format.raw/*17.7*/("""float: left;
    """),format.raw/*18.5*/("""}"""),format.raw/*18.6*/("""

    """),format.raw/*20.5*/("""li a """),format.raw/*20.10*/("""{"""),format.raw/*20.11*/("""
      """),format.raw/*21.7*/("""display: block;
      color: white;
      text-align: center;
      padding: 14px 16px;
      text-decoration: none;
    """),format.raw/*26.5*/("""}"""),format.raw/*26.6*/("""

    """),format.raw/*28.5*/("""li a:hover """),format.raw/*28.16*/("""{"""),format.raw/*28.17*/("""
      """),format.raw/*29.7*/("""background-color: #111;
    """),format.raw/*30.5*/("""}"""),format.raw/*30.6*/("""
    """),format.raw/*31.5*/("""body """),format.raw/*31.10*/("""{"""),format.raw/*31.11*/("""
      """),format.raw/*32.7*/("""margin:0;
      padding:0;
      font-family: Sans-Serif;
      line-height: 1.5em;
    """),format.raw/*36.5*/("""}"""),format.raw/*36.6*/("""

    """),format.raw/*38.5*/("""header """),format.raw/*38.12*/("""{"""),format.raw/*38.13*/("""
      """),format.raw/*39.7*/("""background: #ccc;
      height: 100px;
      background-color: #00008B;
      background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*43.5*/("""}"""),format.raw/*43.6*/("""

    """),format.raw/*45.5*/("""header h1 """),format.raw/*45.15*/("""{"""),format.raw/*45.16*/("""
      """),format.raw/*46.7*/("""margin: 0;
      padding-top: 15px;
      background-color: #00008B;
      background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*50.5*/("""}"""),format.raw/*50.6*/("""

    """),format.raw/*52.5*/("""main """),format.raw/*52.10*/("""{"""),format.raw/*52.11*/("""
      """),format.raw/*53.7*/("""padding-bottom: 10010px;
      margin-bottom: -10000px;
      float: left;
      width: 100%;
      background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*58.5*/("""}"""),format.raw/*58.6*/("""

    """),format.raw/*60.5*/("""nav """),format.raw/*60.9*/("""{"""),format.raw/*60.10*/("""
      """),format.raw/*61.7*/("""padding-bottom: 10010px;
      margin-bottom: -10000px;
      float: left;
      width: 230px;
      margin-left: -230px;
      background: #eee;
    """),format.raw/*67.5*/("""}"""),format.raw/*67.6*/("""

    """),format.raw/*69.5*/("""footer """),format.raw/*69.12*/("""{"""),format.raw/*69.13*/("""
      """),format.raw/*70.7*/("""clear: left;
      width: 100%;
      text-align: center;
      padding: 4px 0;
      background-color: #FFFFFF;
      text-color:#000000;
    """),format.raw/*76.5*/("""}"""),format.raw/*76.6*/("""


    """),format.raw/*79.5*/("""#wrapper """),format.raw/*79.14*/("""{"""),format.raw/*79.15*/("""
      """),format.raw/*80.7*/("""overflow: hidden;
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/("""

    """),format.raw/*83.5*/("""#content """),format.raw/*83.14*/("""{"""),format.raw/*83.15*/("""
      """),format.raw/*84.7*/("""margin-right: 230px; /* Same as 'nav' width */
    """),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""

    """),format.raw/*87.5*/(""".innertube """),format.raw/*87.16*/("""{"""),format.raw/*87.17*/("""
      """),format.raw/*88.7*/("""margin: 15px; /* Padding for content */
      margin-top: 0;
      background-color: #FFFFFF;
      text-color:#000000;
    """),format.raw/*92.5*/("""}"""),format.raw/*92.6*/("""

    """),format.raw/*94.5*/("""p """),format.raw/*94.7*/("""{"""),format.raw/*94.8*/("""
      """),format.raw/*95.7*/("""color: #555;
    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/("""

    """),format.raw/*98.5*/("""nav ul """),format.raw/*98.12*/("""{"""),format.raw/*98.13*/("""
      """),format.raw/*99.7*/("""list-style-type: none;
      margin: 0;
      padding: 0;
    """),format.raw/*102.5*/("""}"""),format.raw/*102.6*/("""

    """),format.raw/*104.5*/("""nav ul a """),format.raw/*104.14*/("""{"""),format.raw/*104.15*/("""
      """),format.raw/*105.7*/("""color: darkgreen;
      text-decoration: none;
    """),format.raw/*107.5*/("""}"""),format.raw/*107.6*/("""

    """),format.raw/*109.5*/("""</style>

  </head>

  <body>

    <div align="center" >
      <h1><a> Hotel Management System</a></h1>
    </div>
    <ul>
      <li><a class="active" href=""""),_display_(/*119.36*/routes/*119.42*/.RedirectionController.redirectHome()),format.raw/*119.79*/("""">Home</a></li>
      <li><a href=""""),_display_(/*120.21*/routes/*120.27*/.RedirectionController.redirectAdmin()),format.raw/*120.65*/("""">Admin</a></li>
      <li><a class="active" href=""""),_display_(/*121.36*/routes/*121.42*/.RedirectionController.redirectAdminWaiter()),format.raw/*121.86*/("""">Assign Waiter</a></li>
      <li><a href=""""),_display_(/*122.21*/routes/*122.27*/.RedirectionController.redirectAdminAddRoom()),format.raw/*122.72*/("""">Rooms</a></li>
      <li><a href=""""),_display_(/*123.21*/routes/*123.27*/.RedirectionController.redirectAdminAddRoomType()),format.raw/*123.76*/("""">Room Type</a></li>
    </ul>
    <br>

    <div id="wrapper">

      <main>

        <h1> Create a new Room Type </h1>
        <h2> """),_display_(/*132.15*/message),format.raw/*132.22*/(""" """),format.raw/*132.23*/("""</h2>
        <p><script>generateText(20)</script></p>

        <form>

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
          <br>
          <br>
          <br>
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

  </body>
</html>

"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object RoomTypeUpdateSuccess extends RoomTypeUpdateSuccess_Scope0.RoomTypeUpdateSuccess
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 20:20:03 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/RoomTypeUpdateSuccess.scala.html
                  HASH: d57fcb93744980e889dca754b1430d5624deed7a
                  MATRIX: 777->1|890->19|918->21|1168->245|1195->246|1229->254|1377->375|1405->376|1440->384|1470->387|1498->388|1533->396|1578->414|1606->415|1641->423|1674->428|1703->429|1738->437|1891->563|1919->564|1954->572|1993->583|2022->584|2057->592|2113->621|2141->622|2174->628|2207->633|2236->634|2271->642|2390->734|2418->735|2453->743|2488->750|2517->751|2552->759|2716->896|2744->897|2779->905|2817->915|2846->916|2881->924|3042->1058|3070->1059|3105->1067|3138->1072|3167->1073|3202->1081|3389->1241|3417->1242|3452->1250|3483->1254|3512->1255|3547->1263|3730->1419|3758->1420|3793->1428|3828->1435|3857->1436|3892->1444|4068->1593|4096->1594|4133->1604|4170->1613|4199->1614|4234->1622|4284->1645|4312->1646|4347->1654|4384->1663|4413->1664|4448->1672|4527->1724|4555->1725|4590->1733|4629->1744|4658->1745|4693->1753|4848->1881|4876->1882|4911->1890|4940->1892|4968->1893|5003->1901|5048->1919|5076->1920|5111->1928|5146->1935|5175->1936|5210->1944|5303->2009|5332->2010|5368->2018|5406->2027|5436->2028|5472->2036|5553->2089|5582->2090|5618->2098|5815->2267|5831->2273|5890->2310|5955->2347|5971->2353|6031->2391|6112->2444|6128->2450|6194->2494|6268->2540|6284->2546|6351->2591|6417->2629|6433->2635|6504->2684|6676->2828|6705->2835|6735->2836
                  LINES: 27->1|32->1|33->2|39->8|39->8|40->9|45->14|45->14|47->16|47->16|47->16|48->17|49->18|49->18|51->20|51->20|51->20|52->21|57->26|57->26|59->28|59->28|59->28|60->29|61->30|61->30|62->31|62->31|62->31|63->32|67->36|67->36|69->38|69->38|69->38|70->39|74->43|74->43|76->45|76->45|76->45|77->46|81->50|81->50|83->52|83->52|83->52|84->53|89->58|89->58|91->60|91->60|91->60|92->61|98->67|98->67|100->69|100->69|100->69|101->70|107->76|107->76|110->79|110->79|110->79|111->80|112->81|112->81|114->83|114->83|114->83|115->84|116->85|116->85|118->87|118->87|118->87|119->88|123->92|123->92|125->94|125->94|125->94|126->95|127->96|127->96|129->98|129->98|129->98|130->99|133->102|133->102|135->104|135->104|135->104|136->105|138->107|138->107|140->109|150->119|150->119|150->119|151->120|151->120|151->120|152->121|152->121|152->121|153->122|153->122|153->122|154->123|154->123|154->123|163->132|163->132|163->132
                  -- GENERATED --
              */
          