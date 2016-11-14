
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object GuestPreference_Scope0 {
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

class GuestPreference extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Set[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(roomTypeList : Set[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""
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
    <li><a class="active" href=""""),_display_(/*118.34*/routes/*118.40*/.RedirectionController.redirectHome()),format.raw/*118.77*/("""">Home</a></li>
    <li><a href=""""),_display_(/*119.19*/routes/*119.25*/.RedirectionController.redirectGuest()),format.raw/*119.63*/("""">Guest</a></li>
    <li><a class="active" href=""""),_display_(/*120.34*/routes/*120.40*/.RedirectionController.redirectBookRoom()),format.raw/*120.81*/("""">Book Room</a></li>
    <li><a href=""""),_display_(/*121.19*/routes/*121.25*/.RedirectionController.redirectBookingStatus()),format.raw/*121.71*/("""">Check Status</a></li>
</ul>

    <div id="wrapper">

      <main>
            <h1> Enter Booking Details </h1>
            <p><script>generateText(20)</script></p>

<form method="POST" action=""""),_display_(/*130.30*/routes/*130.36*/.GuestPreferences.GuestRoomAllocation()),format.raw/*130.75*/("""">
<table>
<tr>
<td><b>Room Type:</b></td>
<td><select name="roomType">
<option name="selectRoomType" value="Select">Select a room type</option>
           """),_display_(/*136.13*/for(roomType <- roomTypeList) yield /*136.42*/{_display_(Seq[Any](format.raw/*136.43*/("""
               """),format.raw/*137.16*/("""<option name=""""),_display_(/*137.31*/roomType),format.raw/*137.39*/("""" value=""""),_display_(/*137.49*/roomType),format.raw/*137.57*/("""">"""),_display_(/*137.60*/roomType),format.raw/*137.68*/("""</option>
           """)))}),format.raw/*138.13*/("""

       """),format.raw/*140.8*/("""</select></td>
</tr>
<tr>
<td><b>Number Of Rooms:</b></td>
<td><input type="text" name="noofrooms"></td>
</tr>
<tr>
<td><b>Start Date:</b></td>
<td><input type="date" name="startdate"></td>
</tr>
<tr>
<td><b>Number Of Days :</b></td>
<td><b><input type="text" name="noofdays"></b></td>
</tr>
</table>
<br>
<br>
<input type="submit" value="Submit" name="actionEvent">
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
</html>"""))
      }
    }
  }

  def render(roomTypeList:Set[String]): play.twirl.api.HtmlFormat.Appendable = apply(roomTypeList)

  def f:((Set[String]) => play.twirl.api.HtmlFormat.Appendable) = (roomTypeList) => apply(roomTypeList)

  def ref: this.type = this

}


}

/**/
object GuestPreference extends GuestPreference_Scope0.GuestPreference
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 19:46:43 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/GuestPreference.scala.html
                  HASH: cb7c594ee804d1e931911b6aa111f0921d170123
                  MATRIX: 770->1|893->29|921->31|1167->251|1194->252|1226->258|1362->367|1390->368|1421->372|1451->375|1479->376|1512->382|1553->396|1581->397|1612->401|1644->406|1672->407|1705->413|1846->527|1874->528|1905->532|1944->543|1973->544|2006->550|2058->575|2086->576|2119->582|2152->587|2181->588|2216->596|2335->688|2363->689|2398->697|2433->704|2462->705|2497->713|2655->844|2683->845|2718->853|2756->863|2785->864|2820->872|2975->1000|3003->1001|3038->1009|3071->1014|3100->1015|3135->1023|3322->1183|3350->1184|3385->1192|3416->1196|3445->1197|3480->1205|3663->1361|3691->1362|3726->1370|3761->1377|3790->1378|3825->1386|4001->1535|4029->1536|4066->1546|4103->1555|4132->1556|4167->1564|4217->1587|4245->1588|4280->1596|4317->1605|4346->1606|4381->1614|4460->1666|4488->1667|4523->1675|4562->1686|4591->1687|4626->1695|4787->1829|4815->1830|4850->1838|4879->1840|4907->1841|4942->1849|4987->1867|5015->1868|5050->1876|5085->1883|5114->1884|5149->1892|5242->1957|5271->1958|5307->1966|5345->1975|5375->1976|5411->1984|5492->2037|5521->2038|5557->2046|5732->2193|5748->2199|5807->2236|5870->2271|5886->2277|5946->2315|6025->2366|6041->2372|6104->2413|6172->2453|6188->2459|6256->2505|6489->2710|6505->2716|6566->2755|6757->2918|6803->2947|6843->2948|6889->2965|6932->2980|6962->2988|7000->2998|7030->3006|7061->3009|7091->3017|7146->3040|7185->3051
                  LINES: 27->1|32->1|33->2|39->8|39->8|40->9|45->14|45->14|47->16|47->16|47->16|48->17|49->18|49->18|51->20|51->20|51->20|52->21|57->26|57->26|59->28|59->28|59->28|60->29|61->30|61->30|62->31|62->31|62->31|63->32|67->36|67->36|69->38|69->38|69->38|70->39|74->43|74->43|76->45|76->45|76->45|77->46|81->50|81->50|83->52|83->52|83->52|84->53|89->58|89->58|91->60|91->60|91->60|92->61|98->67|98->67|100->69|100->69|100->69|101->70|107->76|107->76|110->79|110->79|110->79|111->80|112->81|112->81|114->83|114->83|114->83|115->84|116->85|116->85|118->87|118->87|118->87|119->88|123->92|123->92|125->94|125->94|125->94|126->95|127->96|127->96|129->98|129->98|129->98|130->99|133->102|133->102|135->104|135->104|135->104|136->105|138->107|138->107|140->109|149->118|149->118|149->118|150->119|150->119|150->119|151->120|151->120|151->120|152->121|152->121|152->121|161->130|161->130|161->130|167->136|167->136|167->136|168->137|168->137|168->137|168->137|168->137|168->137|168->137|169->138|171->140
                  -- GENERATED --
              */
          