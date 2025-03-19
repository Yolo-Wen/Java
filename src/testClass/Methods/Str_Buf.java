package testClass.Methods;

public class Str_Buf {
    private StringBuffer str = null;
    public Str_Buf(StringBuffer str){
        this.str = str;
    };
    //get and set for str(StringBuffer)
    public StringBuffer getStr(){
        return str;
    }
    public void setStr(StringBuffer str) {
        this.str = str;
    }
    //StringBuffer's methods
    public void methods(String s,int index){
        //charAt() method
        System.out.println("char charAt(int index) method(返回索引处的字符): "+this.str.charAt(index));
        //capacity() method
        int cap = str.capacity();
        System.out.println("int capacity() method(返回字符缓冲区的容量): "+this.str.capacity());
        //length() method
        System.out.println("int length() method(返回字符缓冲区中字符串的长度): "+this.str.length());
        //append() method
        this.str.append(s);
        System.out.println("stringBuffer append(String str) method(添加字符串到StringBuffer末尾): "+getStr());
        //insert() method
        this.str.insert(index,s);
        System.out.println("stringBuffer insert(int index,String str) method(在指定位置index处插入字符串str): "+getStr());
        //replace() method
        str.replace(0,3,"gold");
        System.out.println("stringBuffer replace(int index,char ch) method(修改指定位置index处的字符): "+getStr());
        //delete() method
        this.str.delete(0,3);
        System.out.println("stringBuffer delete(int start ,int end)method(删除指定位置start到end之间的字符)[deleteCharAt(int index)补充：删除索引处的字符]: "+getStr());
        //substring() method
        String substring = str.substring(0);
        System.out.println("string substring(int start) method(返回从start开始到结尾的子字符串)[substring(int start,int end)补充：返回从start开始到end-1(即左闭右开区间)的子字符串]: "+substring);
        //reverse() method
        this.str.reverse();
        System.out.println("stringBuffer reverse() method(反转字符缓冲区中的字符串): "+getStr());
    }
}
