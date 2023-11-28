package minesweeper

interface MinePointCreateStrategy {
    fun createMinePoints(mineMapInfo: MineMapInfo): List<Point>

    fun Int.getPoint(rowNum: Int): Point {
        val rowIdx = this / rowNum
        val colIdx = this % rowNum
        return Point(rowIdx, colIdx)
    }
}
