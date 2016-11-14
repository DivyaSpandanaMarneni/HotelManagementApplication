
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object RoomTypesList_Scope0 {
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

class RoomTypesList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[RoomType],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(roomTypeList : List[RoomType]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""
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
    <li><a class="active" href=""""),_display_(/*120.34*/routes/*120.40*/.RedirectionController.redirectHome()),format.raw/*120.77*/("""">Home</a></li>
    <li><a href=""""),_display_(/*121.19*/routes/*121.25*/.RedirectionController.redirectAdmin()),format.raw/*121.63*/("""">Admin</a></li>
    <li><a class="active" href=""""),_display_(/*122.34*/routes/*122.40*/.RedirectionController.redirectAdminWaiter()),format.raw/*122.84*/("""">Assign Waiter</a></li>
    <li><a href=""""),_display_(/*123.19*/routes/*123.25*/.RedirectionController.redirectAdminAddRoom()),format.raw/*123.70*/("""">Rooms</a></li>
    <li><a href=""""),_display_(/*124.19*/routes/*124.25*/.RedirectionController.redirectAdminAddRoomType()),format.raw/*124.74*/("""">Room Type</a></li>
    </ul>
    <br>

<div id="wrapper">

    <main>


                <h2> Types of Rooms available</h2>

                <form method="POST" action=""""),_display_(/*135.46*/routes/*135.52*/.AdminRoomTypeController.addNewRoomType()),format.raw/*135.93*/("""">
                    <table>

                        <tr>
                            <td><b>Room Type</b></td><td><b>Price</b></td>
                            <td><b>Number of Beds</b></td><td><b>WiFi</b></td><td><b>Smoking</b></td>
                        </tr>

                        <!-- for loop -->
                        """),_display_(/*144.26*/for(roomType <- roomTypeList) yield /*144.55*/{_display_(Seq[Any](format.raw/*144.56*/("""
                        """),format.raw/*145.25*/("""<tr>
                            <td>"""),_display_(/*146.34*/roomType/*146.42*/.getRoomType),format.raw/*146.54*/("""</td><td>"""),_display_(/*146.64*/roomType/*146.72*/.getPrice),format.raw/*146.81*/("""</td>
                            <td>"""),_display_(/*147.34*/roomType/*147.42*/.getBedsCount),format.raw/*147.55*/("""</td><td>"""),_display_(/*147.65*/roomType/*147.73*/.getWiFi),format.raw/*147.81*/("""</td><td>"""),_display_(/*147.91*/roomType/*147.99*/.getSmoking),format.raw/*147.110*/("""</td>
                        </tr>
                        """)))}),format.raw/*149.26*/("""
                        """),format.raw/*150.25*/("""<tr></tr>


                    </table>
                    <table>

                        <tr><td><input type="submit" value="Add new room type" name="AdminAddRoom"></td></tr>

                    </table>
                </form>

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

  def render(roomTypeList:List[RoomType]): play.twirl.api.HtmlFormat.Appendable = apply(roomTypeList)

  def f:((List[RoomType]) => play.twirl.api.HtmlFormat.Appendable) = (roomTypeList) => apply(roomTypeList)

  def ref: this.type = this

}


}

/**/
object RoomTypesList extends RoomTypesList_Scope0.RoomTypesList
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 20:20:03 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/RoomTypesList.scala.html
                  HASH: 4b12a74740077794f336e7ffecf67ff6f34b9650
                  MATRIX: 769->1|895->32|923->34|1167->252|1194->253|1226->259|1362->368|1390->369|1421->373|1451->376|1479->377|1512->383|1553->397|1581->398|1612->402|1644->407|1672->408|1705->414|1846->528|1874->529|1905->533|1944->544|1973->545|2006->551|2058->576|2086->577|2119->583|2152->588|2181->589|2216->597|2335->689|2363->690|2398->698|2433->705|2462->706|2497->714|2655->845|2683->846|2718->854|2756->864|2785->865|2820->873|2975->1001|3003->1002|3038->1010|3071->1015|3100->1016|3135->1024|3322->1184|3350->1185|3385->1193|3416->1197|3445->1198|3480->1206|3663->1362|3691->1363|3726->1371|3761->1378|3790->1379|3825->1387|4001->1536|4029->1537|4066->1547|4103->1556|4132->1557|4167->1565|4217->1588|4245->1589|4280->1597|4317->1606|4346->1607|4381->1615|4460->1667|4488->1668|4523->1676|4562->1687|4591->1688|4626->1696|4787->1830|4815->1831|4850->1839|4879->1841|4907->1842|4942->1850|4987->1868|5015->1869|5050->1877|5085->1884|5114->1885|5149->1893|5242->1958|5271->1959|5307->1967|5345->1976|5375->1977|5411->1985|5492->2038|5521->2039|5557->2047|5732->2194|5748->2200|5807->2237|5870->2272|5886->2278|5946->2316|6025->2367|6041->2373|6107->2417|6179->2461|6195->2467|6262->2512|6326->2548|6342->2554|6413->2603|6623->2785|6639->2791|6702->2832|7075->3177|7121->3206|7161->3207|7216->3233|7283->3272|7301->3280|7335->3292|7373->3302|7391->3310|7422->3319|7490->3359|7508->3367|7543->3380|7581->3390|7599->3398|7629->3406|7667->3416|7685->3424|7719->3435|7814->3498|7869->3524
                  LINES: 27->1|32->1|33->2|39->8|39->8|40->9|45->14|45->14|47->16|47->16|47->16|48->17|49->18|49->18|51->20|51->20|51->20|52->21|57->26|57->26|59->28|59->28|59->28|60->29|61->30|61->30|62->31|62->31|62->31|63->32|67->36|67->36|69->38|69->38|69->38|70->39|74->43|74->43|76->45|76->45|76->45|77->46|81->50|81->50|83->52|83->52|83->52|84->53|89->58|89->58|91->60|91->60|91->60|92->61|98->67|98->67|100->69|100->69|100->69|101->70|107->76|107->76|110->79|110->79|110->79|111->80|112->81|112->81|114->83|114->83|114->83|115->84|116->85|116->85|118->87|118->87|118->87|119->88|123->92|123->92|125->94|125->94|125->94|126->95|127->96|127->96|129->98|129->98|129->98|130->99|133->102|133->102|135->104|135->104|135->104|136->105|138->107|138->107|140->109|151->120|151->120|151->120|152->121|152->121|152->121|153->122|153->122|153->122|154->123|154->123|154->123|155->124|155->124|155->124|166->135|166->135|166->135|175->144|175->144|175->144|176->145|177->146|177->146|177->146|177->146|177->146|177->146|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|178->147|180->149|181->150
                  -- GENERATED --
              */
          