
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object CheckBookingsStatus_Scope0 {
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

class CheckBookingsStatus extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[BookingStatus],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listBStatus: List[BookingStatus]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""
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
      <li><a class="active" href=""""),_display_(/*118.36*/routes/*118.42*/.RedirectionController.redirectHome()),format.raw/*118.79*/("""">Home</a></li>
      <li><a href=""""),_display_(/*119.21*/routes/*119.27*/.RedirectionController.redirectGuest()),format.raw/*119.65*/("""">Guest</a></li>
      <li><a class="active" href=""""),_display_(/*120.36*/routes/*120.42*/.RedirectionController.redirectBookRoom()),format.raw/*120.83*/("""">Book Room</a></li>
      <li><a href=""""),_display_(/*121.21*/routes/*121.27*/.RedirectionController.redirectBookingStatus()),format.raw/*121.73*/("""">Check Status</a></li>
    </ul>

    <div id="wrapper">

      <main>

        <h1> Reservation  </h1>
        <h2> Details of your reservations: </h2>
        <p><script>generateText(20)</script></p>

        <form>
          <table>
            <tr>
              <td><b>Room Number</b></td><td><b>Checkin Date</b></td>
              <td><b>Days</b></td>
            </tr>

              <!-- for loop -->
            """),_display_(/*140.14*/for(bStatus <- listBStatus) yield /*140.41*/{_display_(Seq[Any](format.raw/*140.42*/("""
              """),format.raw/*141.15*/("""<tr>
                <td>"""),_display_(/*142.22*/bStatus/*142.29*/.roomNumber),format.raw/*142.40*/("""</td><td>"""),_display_(/*142.50*/bStatus/*142.57*/.checkInDt),format.raw/*142.67*/("""</td>
                <td>"""),_display_(/*143.22*/bStatus/*143.29*/.Days),format.raw/*143.34*/("""</td>
              </tr>
            """)))}),format.raw/*145.14*/("""
          """),format.raw/*146.11*/("""</table>
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

  def render(listBStatus:List[BookingStatus]): play.twirl.api.HtmlFormat.Appendable = apply(listBStatus)

  def f:((List[BookingStatus]) => play.twirl.api.HtmlFormat.Appendable) = (listBStatus) => apply(listBStatus)

  def ref: this.type = this

}


}

/**/
object CheckBookingsStatus extends CheckBookingsStatus_Scope0.CheckBookingsStatus
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 19:28:19 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/CheckBookingsStatus.scala.html
                  HASH: 44baebb6980f57c288055971248dc37ca9e855e7
                  MATRIX: 786->1|915->35|943->37|1193->261|1220->262|1254->270|1402->391|1430->392|1465->400|1495->403|1523->404|1558->412|1603->430|1631->431|1666->439|1699->444|1728->445|1763->453|1916->579|1944->580|1979->588|2018->599|2047->600|2082->608|2138->637|2166->638|2199->644|2232->649|2261->650|2296->658|2415->750|2443->751|2478->759|2513->766|2542->767|2577->775|2741->912|2769->913|2804->921|2842->931|2871->932|2906->940|3067->1074|3095->1075|3130->1083|3163->1088|3192->1089|3227->1097|3414->1257|3442->1258|3477->1266|3508->1270|3537->1271|3572->1279|3755->1435|3783->1436|3818->1444|3853->1451|3882->1452|3917->1460|4093->1609|4121->1610|4158->1620|4195->1629|4224->1630|4259->1638|4309->1661|4337->1662|4372->1670|4409->1679|4438->1680|4473->1688|4552->1740|4580->1741|4615->1749|4654->1760|4683->1761|4718->1769|4873->1897|4901->1898|4936->1906|4965->1908|4993->1909|5028->1917|5073->1935|5101->1936|5136->1944|5171->1951|5200->1952|5235->1960|5328->2025|5357->2026|5393->2034|5431->2043|5461->2044|5497->2052|5578->2105|5607->2106|5643->2114|5838->2281|5854->2287|5913->2324|5978->2361|5994->2367|6054->2405|6135->2458|6151->2464|6214->2505|6284->2547|6300->2553|6368->2599|6838->3041|6882->3068|6922->3069|6967->3085|7022->3112|7039->3119|7072->3130|7110->3140|7127->3147|7159->3157|7215->3185|7232->3192|7259->3197|7332->3238|7373->3250
                  LINES: 27->1|32->1|33->2|39->8|39->8|40->9|45->14|45->14|47->16|47->16|47->16|48->17|49->18|49->18|51->20|51->20|51->20|52->21|57->26|57->26|59->28|59->28|59->28|60->29|61->30|61->30|62->31|62->31|62->31|63->32|67->36|67->36|69->38|69->38|69->38|70->39|74->43|74->43|76->45|76->45|76->45|77->46|81->50|81->50|83->52|83->52|83->52|84->53|89->58|89->58|91->60|91->60|91->60|92->61|98->67|98->67|100->69|100->69|100->69|101->70|107->76|107->76|110->79|110->79|110->79|111->80|112->81|112->81|114->83|114->83|114->83|115->84|116->85|116->85|118->87|118->87|118->87|119->88|123->92|123->92|125->94|125->94|125->94|126->95|127->96|127->96|129->98|129->98|129->98|130->99|133->102|133->102|135->104|135->104|135->104|136->105|138->107|138->107|140->109|149->118|149->118|149->118|150->119|150->119|150->119|151->120|151->120|151->120|152->121|152->121|152->121|171->140|171->140|171->140|172->141|173->142|173->142|173->142|173->142|173->142|173->142|174->143|174->143|174->143|176->145|177->146
                  -- GENERATED --
              */
          