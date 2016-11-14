
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object AssignWaiter_Scope0 {
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

class AssignWaiter extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Integer],List[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rooms : List[Integer],emps : List[Employee]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.47*/("""

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
    <li><a class="active" href=""""),_display_(/*121.34*/routes/*121.40*/.RedirectionController.redirectHome()),format.raw/*121.77*/("""">Home</a></li>
    <li><a href=""""),_display_(/*122.19*/routes/*122.25*/.RedirectionController.redirectAdmin()),format.raw/*122.63*/("""">Admin</a></li>
    <li><a class="active" href=""""),_display_(/*123.34*/routes/*123.40*/.RedirectionController.redirectAdminWaiter()),format.raw/*123.84*/("""">Assign Waiter</a></li>
    <li><a href=""""),_display_(/*124.19*/routes/*124.25*/.RedirectionController.redirectAdminAddRoom()),format.raw/*124.70*/("""">Rooms</a></li>
    <li><a href=""""),_display_(/*125.19*/routes/*125.25*/.RedirectionController.redirectAdminAddRoomType()),format.raw/*125.74*/("""">Room Type</a></li>
      </ul>
      <br>
    <div id="wrapper">

      <main>

            <h2> Assign Waiters to rooms</h2>

                <form method="POST" action=""""),_display_(/*134.46*/routes/*134.52*/.AssignWaiterController.updateRoomWaiter()),format.raw/*134.94*/("""">
                  <table>

                  <tr>
                  <td><b>Select Room:</b></td>
                  <td><select name="room">
                    <option name="Select" value="Select">Select a room</option>
                    """),_display_(/*141.22*/for(roomNumber <- rooms) yield /*141.46*/{_display_(Seq[Any](format.raw/*141.47*/("""
                      """),format.raw/*142.23*/("""<option name=""""),_display_(/*142.38*/roomNumber),format.raw/*142.48*/("""" value=""""),_display_(/*142.58*/roomNumber),format.raw/*142.68*/("""">"""),_display_(/*142.71*/roomNumber),format.raw/*142.81*/("""</option>
                    """)))}),format.raw/*143.22*/("""

                  """),format.raw/*145.19*/("""</select></td>
                    </tr>
                    <tr>
                  <td><b>Assign Waiters :</b></td>
                  <td><select name="employee">
                    <option name="SelectEmp" value="SelectEmp">Select an employee</option>
                    """),_display_(/*151.22*/for(emp <- emps) yield /*151.38*/{_display_(Seq[Any](format.raw/*151.39*/("""
                      """),format.raw/*152.23*/("""<option name=""""),_display_(/*152.38*/emp/*152.41*/.getEid),format.raw/*152.48*/("""" value=""""),_display_(/*152.58*/emp/*152.61*/.getEid),format.raw/*152.68*/("""">"""),_display_(/*152.71*/emp/*152.74*/.getEname),format.raw/*152.83*/("""</option>
                    """)))}),format.raw/*153.22*/("""

                  """),format.raw/*155.19*/("""</select></td>
            </tr>
                    <tr><td><input type="submit" value="Submit" name="action"></td></tr>
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

  def render(rooms:List[Integer],emps:List[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(rooms,emps)

  def f:((List[Integer],List[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (rooms,emps) => apply(rooms,emps)

  def ref: this.type = this

}


}

/**/
object AssignWaiter extends AssignWaiter_Scope0.AssignWaiter
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 20:20:03 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/AssignWaiter.scala.html
                  HASH: a3e7deaff823c72064676b41487666c5e38fcf7b
                  MATRIX: 781->1|921->46|951->50|1197->270|1224->271|1257->277|1393->386|1421->387|1452->391|1482->394|1510->395|1543->401|1584->415|1612->416|1643->420|1675->425|1703->426|1736->432|1877->546|1905->547|1936->551|1975->562|2004->563|2037->569|2089->594|2117->595|2150->601|2183->606|2212->607|2247->615|2366->707|2394->708|2429->716|2464->723|2493->724|2528->732|2686->863|2714->864|2749->872|2787->882|2816->883|2851->891|3006->1019|3034->1020|3069->1028|3102->1033|3131->1034|3166->1042|3353->1202|3381->1203|3416->1211|3447->1215|3476->1216|3511->1224|3694->1380|3722->1381|3757->1389|3792->1396|3821->1397|3856->1405|4032->1554|4060->1555|4097->1565|4134->1574|4163->1575|4198->1583|4248->1606|4276->1607|4311->1615|4348->1624|4377->1625|4412->1633|4491->1685|4519->1686|4554->1694|4593->1705|4622->1706|4657->1714|4818->1848|4846->1849|4881->1857|4910->1859|4938->1860|4973->1868|5018->1886|5046->1887|5081->1895|5116->1902|5145->1903|5181->1911|5274->1976|5303->1977|5339->1985|5377->1994|5407->1995|5443->2003|5524->2056|5553->2057|5589->2065|5768->2216|5784->2222|5843->2259|5906->2294|5922->2300|5982->2338|6061->2389|6077->2395|6143->2439|6215->2483|6231->2489|6298->2534|6362->2570|6378->2576|6449->2625|6660->2808|6676->2814|6740->2856|7019->3107|7060->3131|7100->3132|7153->3156|7196->3171|7228->3181|7266->3191|7298->3201|7329->3204|7361->3214|7425->3246|7476->3268|7786->3550|7819->3566|7859->3567|7912->3591|7955->3606|7968->3609|7997->3616|8035->3626|8048->3629|8077->3636|8108->3639|8121->3642|8152->3651|8216->3683|8267->3705
                  LINES: 27->1|32->1|34->3|40->9|40->9|41->10|46->15|46->15|48->17|48->17|48->17|49->18|50->19|50->19|52->21|52->21|52->21|53->22|58->27|58->27|60->29|60->29|60->29|61->30|62->31|62->31|63->32|63->32|63->32|64->33|68->37|68->37|70->39|70->39|70->39|71->40|75->44|75->44|77->46|77->46|77->46|78->47|82->51|82->51|84->53|84->53|84->53|85->54|90->59|90->59|92->61|92->61|92->61|93->62|99->68|99->68|101->70|101->70|101->70|102->71|108->77|108->77|111->80|111->80|111->80|112->81|113->82|113->82|115->84|115->84|115->84|116->85|117->86|117->86|119->88|119->88|119->88|120->89|124->93|124->93|126->95|126->95|126->95|127->96|128->97|128->97|130->99|130->99|130->99|131->100|134->103|134->103|136->105|136->105|136->105|137->106|139->108|139->108|141->110|152->121|152->121|152->121|153->122|153->122|153->122|154->123|154->123|154->123|155->124|155->124|155->124|156->125|156->125|156->125|165->134|165->134|165->134|172->141|172->141|172->141|173->142|173->142|173->142|173->142|173->142|173->142|173->142|174->143|176->145|182->151|182->151|182->151|183->152|183->152|183->152|183->152|183->152|183->152|183->152|183->152|183->152|183->152|184->153|186->155
                  -- GENERATED --
              */
          