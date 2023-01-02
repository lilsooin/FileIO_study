import java.io.*

fun main() {
    val osType = System.getProperty("os.name")
    println("OSType >> $osType")
    if (osType.contains("Windows")) {
        // 파일을 가져올 수 있지만 제대로 읽을 수 없음
        //  1Byte씩 읽는 것이기 때문

        /*val fileInputStream = FileInputStream("C:\\aa\\Hello.java")
        while (fileInputStream.read() != -1) {
            println(fileInputStream.read())
        }*/

        // reader로 읽는 다양한 방법들
        // InputStream: Byte단위로 처리
        // InputStreamReader: 문자(char)로 처리
         val fr = FileReader("C:\\aa\\Hello.java")
        println("fr >>> ${fr.readText()}")

        val br1 = BufferedReader(FileReader("C:\\aa\\Hello.java"))
        println("br1 >>> ${br1.read()}")

        val ir = InputStreamReader(FileInputStream("C:\\aa\\Hello.java"))
        println("ir >>> ${ir.readText()}")

        val br2 = BufferedReader(InputStreamReader(FileInputStream("C:\\aa\\Hello.java")))
        println("br >>> ${br2.readLine()}")

        fr.close()
        br1.close()
        ir.close()
        br2.close()
    } else if (osType.contains("Mac")) {
        // mac의 기본 path 구성
        val fileReader = FileReader("/Users/isu-in/Documents/test.txt")
        println("reader >>> ${fileReader.read()}") // 읽어짐
    }
}

// Windows folder 생성
fun createFolderInWindows() {
    if (System.getProperty("os.name") == "Windows") {
        val folderPath = File("C:\\aa")
        println(folderPath.exists())
        val newFolderPath = folderPath.absolutePath + File.separator + "newFolder"
        val newFolder = File(newFolderPath)
        if (newFolder.exists().not()) {
            newFolder.mkdirs()
        }
    }
}