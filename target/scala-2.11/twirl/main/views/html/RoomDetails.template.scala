
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object RoomDetails_Scope0 {
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

     object RoomDetails_Scope1 {
import com.avaje.ebean.SqlRow

class RoomDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[ReturnRoomView],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(roomsView : List[ReturnRoomView]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.36*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>2 Column Layout &mdash; Right Menu with Header &amp; Footer</title>
    <style type="text/css">
ul """),format.raw/*9.4*/("""{"""),format.raw/*9.5*/("""
    """),format.raw/*10.5*/("""list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/("""

"""),format.raw/*17.1*/("""li """),format.raw/*17.4*/("""{"""),format.raw/*17.5*/("""
    """),format.raw/*18.5*/("""float: left;
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""

"""),format.raw/*21.1*/("""li a """),format.raw/*21.6*/("""{"""),format.raw/*21.7*/("""
    """),format.raw/*22.5*/("""display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/("""

"""),format.raw/*29.1*/("""li a:hover """),format.raw/*29.12*/("""{"""),format.raw/*29.13*/("""
    """),format.raw/*30.5*/("""background-color: #111;
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""
    """),format.raw/*32.5*/("""body """),format.raw/*32.10*/("""{"""),format.raw/*32.11*/("""
      """),format.raw/*33.7*/("""margin:0;
      padding:0;
      font-family: Sans-Serif;
      line-height: 1.5em;
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""

    """),format.raw/*39.5*/("""header """),format.raw/*39.12*/("""{"""),format.raw/*39.13*/("""
      """),format.raw/*40.7*/("""background: #ccc;
      height: 100px;
      background-color: #00008B;
background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*44.5*/("""}"""),format.raw/*44.6*/("""

    """),format.raw/*46.5*/("""header h1 """),format.raw/*46.15*/("""{"""),format.raw/*46.16*/("""
      """),format.raw/*47.7*/("""margin: 0;
      padding-top: 15px;
      background-color: #00008B;
background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*51.5*/("""}"""),format.raw/*51.6*/("""

    """),format.raw/*53.5*/("""main """),format.raw/*53.10*/("""{"""),format.raw/*53.11*/("""
      """),format.raw/*54.7*/("""padding-bottom: 10010px;
      margin-bottom: -10000px;
      float: left;
      width: 100%;
      background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*59.5*/("""}"""),format.raw/*59.6*/("""

    """),format.raw/*61.5*/("""nav """),format.raw/*61.9*/("""{"""),format.raw/*61.10*/("""
      """),format.raw/*62.7*/("""padding-bottom: 10010px;
      margin-bottom: -10000px;
      float: left;
      width: 230px;
      margin-left: -230px;
      background: #eee;
    """),format.raw/*68.5*/("""}"""),format.raw/*68.6*/("""

    """),format.raw/*70.5*/("""footer """),format.raw/*70.12*/("""{"""),format.raw/*70.13*/("""
      """),format.raw/*71.7*/("""clear: left;
      width: 100%;
      text-align: center;
      padding: 4px 0;
      background-color: #FFFFFF;
      text-color:#000000;
    """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/("""


    """),format.raw/*80.5*/("""#wrapper """),format.raw/*80.14*/("""{"""),format.raw/*80.15*/("""
      """),format.raw/*81.7*/("""overflow: hidden;
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/("""

    """),format.raw/*84.5*/("""#content """),format.raw/*84.14*/("""{"""),format.raw/*84.15*/("""
      """),format.raw/*85.7*/("""margin-right: 230px; /* Same as 'nav' width */
    """),format.raw/*86.5*/("""}"""),format.raw/*86.6*/("""

    """),format.raw/*88.5*/(""".innertube """),format.raw/*88.16*/("""{"""),format.raw/*88.17*/("""
      """),format.raw/*89.7*/("""margin: 15px; /* Padding for content */
      margin-top: 0;
      background-color: #FFFFFF;
            text-color:#000000;
    """),format.raw/*93.5*/("""}"""),format.raw/*93.6*/("""

    """),format.raw/*95.5*/("""p """),format.raw/*95.7*/("""{"""),format.raw/*95.8*/("""
      """),format.raw/*96.7*/("""color: #555;
    """),format.raw/*97.5*/("""}"""),format.raw/*97.6*/("""

    """),format.raw/*99.5*/("""nav ul """),format.raw/*99.12*/("""{"""),format.raw/*99.13*/("""
      """),format.raw/*100.7*/("""list-style-type: none;
      margin: 0;
      padding: 0;
    """),format.raw/*103.5*/("""}"""),format.raw/*103.6*/("""

    """),format.raw/*105.5*/("""nav ul a """),format.raw/*105.14*/("""{"""),format.raw/*105.15*/("""
      """),format.raw/*106.7*/("""color: darkgreen;
      text-decoration: none;
    """),format.raw/*108.5*/("""}"""),format.raw/*108.6*/("""

    """),format.raw/*110.5*/("""</style>

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
    <div id ="wrapper">

      <main>
            <h2> Room Details</h2>

            <form method="POST" action=""""),_display_(/*131.42*/routes/*131.48*/.AdminRoomController.addRoomButton()),format.raw/*131.84*/("""">
              <table>

                <tr>
                  <td><b>Room Number</b></td><td><b>Room Type</b></td>
                  <td><b>Room Phone Number</b></td><td><b>Room Waiter</b></td>
                </tr>

                <!-- for loop -->
                """),_display_(/*140.18*/for(room <- roomsView) yield /*140.40*/{_display_(Seq[Any](format.raw/*140.41*/("""
                """),format.raw/*141.17*/("""<tr>
                  <td>"""),_display_(/*142.24*/room/*142.28*/.roomNumber),format.raw/*142.39*/("""</td><td>"""),_display_(/*142.49*/room/*142.53*/.roomType),format.raw/*142.62*/("""</td>
                  <td>"""),_display_(/*143.24*/room/*143.28*/.roomPhoneNumber),format.raw/*143.44*/("""</td><td>"""),_display_(/*143.54*/room/*143.58*/.roomWaiter),format.raw/*143.69*/("""</td>
                </tr>
                """)))}),format.raw/*145.18*/("""
                """),format.raw/*146.17*/("""<tr></tr>


              </table>
              <table>

              <tr><td><input type="submit" value="Add new room" name="AdminAddRoom"></td></tr>

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

  def render(roomsView:List[ReturnRoomView]): play.twirl.api.HtmlFormat.Appendable = apply(roomsView)

  def f:((List[ReturnRoomView]) => play.twirl.api.HtmlFormat.Appendable) = (roomsView) => apply(roomsView)

  def ref: this.type = this

}


}
}

/**/
object RoomDetails extends RoomDetails_Scope0.RoomDetails_Scope1.RoomDetails
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 20:20:03 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/RoomDetails.scala.html
                  HASH: 7c7d51418f8435355743586103be543a08073e70
                  MATRIX: 835->33|964->67|992->69|1238->289|1265->290|1298->296|1434->405|1462->406|1493->410|1523->413|1551->414|1584->420|1625->434|1653->435|1684->439|1716->444|1744->445|1777->451|1918->565|1946->566|1977->570|2016->581|2045->582|2078->588|2130->613|2158->614|2191->620|2224->625|2253->626|2288->634|2407->726|2435->727|2470->735|2505->742|2534->743|2569->751|2727->882|2755->883|2790->891|2828->901|2857->902|2892->910|3047->1038|3075->1039|3110->1047|3143->1052|3172->1053|3207->1061|3394->1221|3422->1222|3457->1230|3488->1234|3517->1235|3552->1243|3735->1399|3763->1400|3798->1408|3833->1415|3862->1416|3897->1424|4073->1573|4101->1574|4138->1584|4175->1593|4204->1594|4239->1602|4289->1625|4317->1626|4352->1634|4389->1643|4418->1644|4453->1652|4532->1704|4560->1705|4595->1713|4634->1724|4663->1725|4698->1733|4859->1867|4887->1868|4922->1876|4951->1878|4979->1879|5014->1887|5059->1905|5087->1906|5122->1914|5157->1921|5186->1922|5222->1930|5315->1995|5344->1996|5380->2004|5418->2013|5448->2014|5484->2022|5565->2075|5594->2076|5630->2084|5805->2231|5821->2237|5880->2274|5943->2309|5959->2315|6019->2353|6098->2404|6114->2410|6180->2454|6252->2498|6268->2504|6335->2549|6399->2585|6415->2591|6486->2640|6681->2807|6697->2813|6755->2849|7063->3129|7102->3151|7142->3152|7189->3170|7246->3199|7260->3203|7293->3214|7331->3224|7345->3228|7376->3237|7434->3267|7448->3271|7486->3287|7524->3297|7538->3301|7571->3312|7650->3359|7697->3377
                  LINES: 30->2|35->2|36->3|42->9|42->9|43->10|48->15|48->15|50->17|50->17|50->17|51->18|52->19|52->19|54->21|54->21|54->21|55->22|60->27|60->27|62->29|62->29|62->29|63->30|64->31|64->31|65->32|65->32|65->32|66->33|70->37|70->37|72->39|72->39|72->39|73->40|77->44|77->44|79->46|79->46|79->46|80->47|84->51|84->51|86->53|86->53|86->53|87->54|92->59|92->59|94->61|94->61|94->61|95->62|101->68|101->68|103->70|103->70|103->70|104->71|110->77|110->77|113->80|113->80|113->80|114->81|115->82|115->82|117->84|117->84|117->84|118->85|119->86|119->86|121->88|121->88|121->88|122->89|126->93|126->93|128->95|128->95|128->95|129->96|130->97|130->97|132->99|132->99|132->99|133->100|136->103|136->103|138->105|138->105|138->105|139->106|141->108|141->108|143->110|152->119|152->119|152->119|153->120|153->120|153->120|154->121|154->121|154->121|155->122|155->122|155->122|156->123|156->123|156->123|164->131|164->131|164->131|173->140|173->140|173->140|174->141|175->142|175->142|175->142|175->142|175->142|175->142|176->143|176->143|176->143|176->143|176->143|176->143|178->145|179->146
                  -- GENERATED --
              */
          