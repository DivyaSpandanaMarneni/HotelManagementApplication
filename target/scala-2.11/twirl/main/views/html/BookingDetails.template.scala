
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object BookingDetails_Scope0 {
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

class BookingDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.view.GuestPreferenceViewRender,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(guestPreference: models.view.GuestPreferenceViewRender):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""
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

            <h1> Reservation Details  </h1>
            <h2> Your room is reserved below are the details: </h2>
            <p><script>generateText(20)</script></p>

<form>
<table>
<tr>
<td><b>Room No is(are) :</b></td>
<td><label for="roomno">"""),_display_(/*137.26*/guestPreference/*137.41*/.rooms),format.raw/*137.47*/("""</label></td>
</tr>
<tr>
<td><b>Check in date :</b></td>
<td><label for="checkin">"""),_display_(/*141.27*/guestPreference/*141.42*/.checkInDt),format.raw/*141.52*/(""" """),format.raw/*141.53*/("""[YYYY-MM-DD]</label></td>
</tr>
<tr>
<td><b>Estimated bill is :</b></td>
<td><b><label for="bill">"""),_display_(/*145.27*/guestPreference/*145.42*/.bill),format.raw/*145.47*/("""</label></b></td>
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

  def render(guestPreference:models.view.GuestPreferenceViewRender): play.twirl.api.HtmlFormat.Appendable = apply(guestPreference)

  def f:((models.view.GuestPreferenceViewRender) => play.twirl.api.HtmlFormat.Appendable) = (guestPreference) => apply(guestPreference)

  def ref: this.type = this

}


}

/**/
object BookingDetails extends BookingDetails_Scope0.BookingDetails
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 19:02:44 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/BookingDetails.scala.html
                  HASH: dc61916f4403ab95a301f80c368e4ba01b7630e6
                  MATRIX: 794->1|945->57|973->59|1219->279|1246->280|1278->286|1414->395|1442->396|1473->400|1503->403|1531->404|1564->410|1605->424|1633->425|1664->429|1696->434|1724->435|1757->441|1898->555|1926->556|1957->560|1996->571|2025->572|2058->578|2110->603|2138->604|2171->610|2204->615|2233->616|2268->624|2387->716|2415->717|2450->725|2485->732|2514->733|2549->741|2715->880|2743->881|2778->889|2816->899|2845->900|2880->908|3043->1044|3071->1045|3106->1053|3139->1058|3168->1059|3203->1067|3390->1227|3418->1228|3453->1236|3484->1240|3513->1241|3548->1249|3731->1405|3759->1406|3794->1414|3829->1421|3858->1422|3893->1430|4069->1579|4097->1580|4134->1590|4171->1599|4200->1600|4235->1608|4285->1631|4313->1632|4348->1640|4385->1649|4414->1650|4449->1658|4528->1710|4556->1711|4591->1719|4630->1730|4659->1731|4694->1739|4855->1873|4883->1874|4918->1882|4947->1884|4975->1885|5010->1893|5055->1911|5083->1912|5118->1920|5153->1927|5182->1928|5217->1936|5310->2001|5339->2002|5375->2010|5413->2019|5443->2020|5479->2028|5560->2081|5589->2082|5625->2090|5800->2237|5816->2243|5875->2280|5938->2315|5954->2321|6014->2359|6093->2410|6109->2416|6172->2457|6240->2497|6256->2503|6324->2549|6683->2880|6708->2895|6736->2901|6851->2988|6876->3003|6908->3013|6938->3014|7069->3117|7094->3132|7121->3137
                  LINES: 27->1|32->1|33->2|39->8|39->8|40->9|45->14|45->14|47->16|47->16|47->16|48->17|49->18|49->18|51->20|51->20|51->20|52->21|57->26|57->26|59->28|59->28|59->28|60->29|61->30|61->30|62->31|62->31|62->31|63->32|67->36|67->36|69->38|69->38|69->38|70->39|74->43|74->43|76->45|76->45|76->45|77->46|81->50|81->50|83->52|83->52|83->52|84->53|89->58|89->58|91->60|91->60|91->60|92->61|98->67|98->67|100->69|100->69|100->69|101->70|107->76|107->76|110->79|110->79|110->79|111->80|112->81|112->81|114->83|114->83|114->83|115->84|116->85|116->85|118->87|118->87|118->87|119->88|123->92|123->92|125->94|125->94|125->94|126->95|127->96|127->96|129->98|129->98|129->98|130->99|133->102|133->102|135->104|135->104|135->104|136->105|138->107|138->107|140->109|149->118|149->118|149->118|150->119|150->119|150->119|151->120|151->120|151->120|152->121|152->121|152->121|168->137|168->137|168->137|172->141|172->141|172->141|172->141|176->145|176->145|176->145
                  -- GENERATED --
              */
          