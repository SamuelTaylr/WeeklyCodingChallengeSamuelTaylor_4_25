import scala.collection.mutable.ListBuffer

object test extends App{

  val grid = Array(
    Array(0, 1, 0, 0),
    Array(0, 0, 0, 0),
    Array(0, 0, 0, 0),
    Array(0, 0, 0, 0))

  val path = ListBuffer[(Int, Int)]()


  def findPath(grid: Array[Array[Int]]): Unit = {

    val row = grid.length
    val col = row

    println("line 19")
    if(pathHelper(0, 0, row, col, path, grid) == true) {
      print(path)
    }

  }

  def pathHelper(r : Int = 0, c : Int = 0, row: Int, col: Int, path: ListBuffer[(Int, Int)], grid: Array[Array[Int]]): Boolean = {

    println("line 27")
    if(grid(r)(c) == 1) return false

    println("line 31")
    path.append((r, c))
    println("line 33")

    if(r == row-1 && c == col-1) return true

    println("line 35")

    if(c+1 < col && pathHelper(r, c+1, row, col, path, grid) == true) {
      println(c, r, col, row)
      return true
    }

    if(r+1 < row && pathHelper(r+1, c, row, col, path, grid) == true) {
      println(c, r, col, row)
      return true
    }




    return false
  }

  findPath(grid)





}
