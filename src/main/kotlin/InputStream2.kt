import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.ByteArrayInputStream
import java.io.InputStream

fun main() {
    /*
    * 1byte씩 읽는게 아니라 파라미터로 주어진 byte 배열 크기 만큼 데이터를 읽고 총 몇 byte를 읽었는지 리턴한다.
    * 데이터를 읽다가 모두 읽으면, 그 만큼의 크기를 반환한다.
    *  시작부터 읽을게 없으면 -1을 반환
    * */
    /*public int read(byte b[]) throws IOException {
        return read(b, 0, b.length);
    }*/

    val data2: ByteArray = byteArrayOf(10, 20, 30, 40, 50)
    val inputStream: InputStream = ByteArrayInputStream(data2)

    val buffer =  ByteArray(2)

    println(inputStream.read(buffer)) // byte 2개 (10, 20)를 읽어 buffer에 넘겨주고 2를 출력
    println(inputStream.read(buffer)) // byte 2개 (30, 40)를 읽어 buffer에 넘겨주고 2를 출력
    println(inputStream.read(buffer)) // byte 1개 (50)를 읽어 buffer에 넘겨주고 1을 출력
    println(inputStream.read(buffer)) // 더 이상 읽을 바이트가 없어서 -1 출력
}