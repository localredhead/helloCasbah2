
/**
 * Created by IntelliJ IDEA.
 * User: dontask
 * Date: 2/13/11
 * Time: 11:43 AM
 * To change this template use File | Settings | File Templates.
 */
import com.mongodb.casbah.Imports._
import scala.xml._
import scala._

class monCon extends Application{

       println("Hello, world!")

       val mongoColl = MongoConnection()("temp")("first")

       println(mongoColl.find())

}