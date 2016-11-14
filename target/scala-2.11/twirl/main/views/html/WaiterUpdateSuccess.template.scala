
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object WaiterUpdateSuccess_Scope0 {
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

class WaiterUpdateSuccess extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Integer,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(roomNumber:Integer, waiterName : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>2 Column Layout &mdash; Right Menu with Header &amp; Footer</title>
    <style type="text/css">
ul """),format.raw/*8.4*/("""{"""),format.raw/*8.5*/("""
    """),format.raw/*9.5*/("""list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/("""

"""),format.raw/*16.1*/("""li """),format.raw/*16.4*/("""{"""),format.raw/*16.5*/("""
    """),format.raw/*17.5*/("""float: left;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""

"""),format.raw/*20.1*/("""li a """),format.raw/*20.6*/("""{"""),format.raw/*20.7*/("""
    """),format.raw/*21.5*/("""display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
"""),format.raw/*26.1*/("""}"""),format.raw/*26.2*/("""

"""),format.raw/*28.1*/("""li a:hover """),format.raw/*28.12*/("""{"""),format.raw/*28.13*/("""
    """),format.raw/*29.5*/("""background-color: #111;
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/("""
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
    <li><a class="active" href=""""),_display_(/*119.34*/routes/*119.40*/.RedirectionController.redirectHome()),format.raw/*119.77*/("""">Home</a></li>
    <li><a href=""""),_display_(/*120.19*/routes/*120.25*/.RedirectionController.redirectAdmin()),format.raw/*120.63*/("""">Admin</a></li>
    <li><a class="active" href=""""),_display_(/*121.34*/routes/*121.40*/.RedirectionController.redirectAdminWaiter()),format.raw/*121.84*/("""">Assign Waiter</a></li>
    <li><a href=""""),_display_(/*122.19*/routes/*122.25*/.RedirectionController.redirectAdminAddRoom()),format.raw/*122.70*/("""">Rooms</a></li>
    <li><a href=""""),_display_(/*123.19*/routes/*123.25*/.RedirectionController.redirectAdminAddRoomType()),format.raw/*123.74*/("""">Room Type</a></li>
      </ul>
      <br>

    <div id="wrapper">

      <main>

            <h1> Administrator  </h1>
            <h2> """),_display_(/*132.19*/waiterName),format.raw/*132.29*/(""" """),format.raw/*132.30*/("""has been assigned to """),_display_(/*132.52*/roomNumber),format.raw/*132.62*/("""</h2>
            <p><script>generateText(20)</script></p>

       
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

  def render(roomNumber:Integer,waiterName:String): play.twirl.api.HtmlFormat.Appendable = apply(roomNumber,waiterName)

  def f:((Integer,String) => play.twirl.api.HtmlFormat.Appendable) = (roomNumber,waiterName) => apply(roomNumber,waiterName)

  def ref: this.type = this

}


}

/**/
object WaiterUpdateSuccess extends WaiterUpdateSuccess_Scope0.WaiterUpdateSuccess
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 20:20:03 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/WaiterUpdateSuccess.scala.html
                  HASH: 937866324f408464b2631b1c58ab234908eb3c99
                  MATRIX: 781->1|917->42|945->44|1191->264|1218->265|1250->271|1386->380|1414->381|1445->385|1475->388|1503->389|1536->395|1577->409|1605->410|1636->414|1668->419|1696->420|1729->426|1870->540|1898->541|1929->545|1968->556|1997->557|2030->563|2082->588|2110->589|2143->595|2176->600|2205->601|2240->609|2359->701|2387->702|2422->710|2457->717|2486->718|2521->726|2679->857|2707->858|2742->866|2780->876|2809->877|2844->885|2999->1013|3027->1014|3062->1022|3095->1027|3124->1028|3159->1036|3346->1196|3374->1197|3409->1205|3440->1209|3469->1210|3504->1218|3687->1374|3715->1375|3750->1383|3785->1390|3814->1391|3849->1399|4025->1548|4053->1549|4090->1559|4127->1568|4156->1569|4191->1577|4241->1600|4269->1601|4304->1609|4341->1618|4370->1619|4405->1627|4484->1679|4512->1680|4547->1688|4586->1699|4615->1700|4650->1708|4811->1842|4839->1843|4874->1851|4903->1853|4931->1854|4966->1862|5011->1880|5039->1881|5074->1889|5109->1896|5138->1897|5173->1905|5266->1970|5295->1971|5331->1979|5369->1988|5399->1989|5435->1997|5516->2050|5545->2051|5581->2059|5758->2208|5774->2214|5833->2251|5896->2286|5912->2292|5972->2330|6051->2381|6067->2387|6133->2431|6205->2475|6221->2481|6288->2526|6352->2562|6368->2568|6439->2617|6615->2765|6647->2775|6677->2776|6727->2798|6759->2808
                  LINES: 27->1|32->1|33->2|39->8|39->8|40->9|45->14|45->14|47->16|47->16|47->16|48->17|49->18|49->18|51->20|51->20|51->20|52->21|57->26|57->26|59->28|59->28|59->28|60->29|61->30|61->30|62->31|62->31|62->31|63->32|67->36|67->36|69->38|69->38|69->38|70->39|74->43|74->43|76->45|76->45|76->45|77->46|81->50|81->50|83->52|83->52|83->52|84->53|89->58|89->58|91->60|91->60|91->60|92->61|98->67|98->67|100->69|100->69|100->69|101->70|107->76|107->76|110->79|110->79|110->79|111->80|112->81|112->81|114->83|114->83|114->83|115->84|116->85|116->85|118->87|118->87|118->87|119->88|123->92|123->92|125->94|125->94|125->94|126->95|127->96|127->96|129->98|129->98|129->98|130->99|133->102|133->102|135->104|135->104|135->104|136->105|138->107|138->107|140->109|150->119|150->119|150->119|151->120|151->120|151->120|152->121|152->121|152->121|153->122|153->122|153->122|154->123|154->123|154->123|163->132|163->132|163->132|163->132|163->132
                  -- GENERATED --
              */
          