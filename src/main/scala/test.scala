import scala.collection.mutable.ListBuffer

object test extends App{

  // Creating test 2d array for "Grid"
  val grid = Array(
    Array(0, 1, 0, 0),
    Array(0, 0, 0, 0),
    Array(0, 0, 0, 0),
    Array(0, 0, 0, 0))

  // Empty list to hold tuple of coordinates in grid
  val path = ListBuffer[(Int, Int)]()


  // method that calls recursive pathHelper method
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
    // Returns false if starting coordinate is blocked
    if(grid(r)(c) == 1) return false

    println("line 31")
    path.append((r, c))
    println("line 33")

    // Returns true if robot is currently at final coordinate
    if(r == row-1 && c == col-1) return true

    println("line 35")

    // recursively tries to go right
    if(c+1 < col && pathHelper(r, c+1, row, col, path, grid) == true) {
      println(c, r, col, row)
      return true
    }

    // recursively tries to go left
    if(r+1 < row && pathHelper(r+1, c, row, col, path, grid) == true) {
      println(c, r, col, row)
      return true
    }




    return false
  }

  findPath(grid)





}
