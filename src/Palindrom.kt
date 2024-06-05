class Palindrom():iPalindrom {
    override fun isPalindrom(text: String): Boolean {
        var start = 0
        var end = text.length - 1
        while (start < end){
            if (text[start] != text[end]) return false
            start++
            end--
        }
        return true
    }
}