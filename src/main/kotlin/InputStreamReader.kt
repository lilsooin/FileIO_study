import java.io.*

fun main() {

    val osType = System.getProperty("os.name")
    println("OSType >> $osType")
    when (osType) {
        "Windows" -> {
            // 파일을 가져올 수 있지만 제대로 읽을 수 없음
            //  1Byte씩 읽는 것이기 때문
            val fileInputStream = FileInputStream("C:\\aa\\Hello.java")
            while (fileInputStream.read() != -1) {
                println(fileInputStream.read())
            }

            // windows
            // val fileReader = FileReader("C:\\aa\\Hello.java")
            // println("reader >>> ${fileReader.readLines()}") // 읽어짐

            val fileReader = FileReader("C:\\aa\\Hello.java")
            BufferedReader(InputStreamReader(FileInputStream("C:\\aa\\Hello.java")))
            FileReader("C:\\aa\\Hello.java")
            // FileInputStream
            //
        }
        "Mac OS X" -> {
            // mac
            val fileReader = FileReader("/Users/isu-in/Documents/test.txt")
            println("reader >>> ${fileReader.readLines()}") // 읽어짐
        }
        else -> {
            // InputStream
            // FileInputStream
            // InputStreamReader
            // FileReader
        }
    }
}

// Windows folder 생성
fun createFolderInWindows(){
    if(System.getProperty("os.name") == "Windows"){
        val folderPath = File("C:\\aa")
        println(folderPath.exists())
        val newFolderPath = folderPath.absolutePath + File.separator + "newFolder"
        val newFolder = File(newFolderPath)
        if (newFolder.exists().not()) {
            newFolder.mkdirs()
        }
    }
}