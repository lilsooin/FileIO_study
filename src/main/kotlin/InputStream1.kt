import java.io.ByteArrayInputStream
import java.io.InputStream

fun main() {
    /*
    * 1byte씩 읽어 그 값을 int로 바꿔서 리턴
    * 더 이상 읽을 수 없는 경우 -1 리턴
    * */
    // public abstract int read() throws IOException;

    val data: ByteArray = byteArrayOf(1,2, 3, -1)
    // val stringBytes: ByteArray = byteArrayOf("1", "2", "3")
    // 컴파일 오류 -> byte가 들어가야하는데 String이 들어감
    // 1byte = 0 ~ 255 or -128 ~ 127) -> 자바는 기본적으로 기본형이 unsigned type이다.

    val inputStream: InputStream = ByteArrayInputStream(data)
    println(inputStream.read()) // 바이트 하나를 읽어서, 1을 읽었고 1 출력
    println(inputStream.read()) // 바이트 하나를 추가로 읽어서, 2를 읽었고 2 출력
    println(inputStream.read()) // 바이트 하나를 추가로 읽어서, 3을 읽었고 3 출력
    println(inputStream.read()) // 바이트 하나를 추가로 읽어서, -1을 읽었고 255 출력
    println(inputStream.read()) // 더 이상 읽을 바이트가 없어서 -1 출력
}