package aeon;

public class Member {
    public String name;
    public String stage;
    public String birth;
    public String position;
    public String nationality;
    public byte[] photo;

    public Member(String n,String s,String b,String p,String nat, byte[] photo) {
        name=n; stage=s; birth=b; position=p; nationality=nat; this.photo = photo;
    }
}
