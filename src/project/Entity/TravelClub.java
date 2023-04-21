package project.Entity;

import project.util.DateUtil;

import java.util.UUID;

public class TravelClub {

    private static final int MINIMUM_NAME_LENGTH=3;
    private static final int MINIMUM_INTRO_LENGTH=5;

    //Fields
    private String id; //고유 id
    private String clubName; //클럽 이름
    private String intro; //클럽 소개
    private String foundationDay; //클럽 개설 시간

    private TravelClub(){
        this.id = UUID.randomUUID().toString();
    }

    //사용자의 입력 받는 생성자, 초기 값으로 클럽 이름과 소개를 받는다.
    public TravelClub(String clubName, String intro){
        this();
        // 아래처럼 접근하면 유효성 검사를 건너 뛰게된다.
        // this.clubName = clubName;
        setClubName(clubName);
        //this.intro = intro;
        setIntro(intro);
        this.foundationDay = DateUtil.today();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        if(clubName.length()<MINIMUM_NAME_LENGTH){
            System.out.println("Club name should be longer then 3");
            return;
        }
        this.clubName = clubName;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        if(intro.length()<MINIMUM_INTRO_LENGTH){
            System.out.println("Club intro should be then" + MINIMUM_INTRO_LENGTH);
            return;
        }
        this.intro = intro;
    }

    public String getFoundationDay() {
        return foundationDay;
    }

    public void setFoundationDay(String foundationDay) {
        this.foundationDay = foundationDay;
    }

    public static TravelClub getSample(){
        String clubName = "Sample Club";
        String intro = "Sample Club intro~~";
        TravelClub sampleClub = new TravelClub(clubName, intro);
        return sampleClub;

        //return new TravelClub("Sample Club","Sample Club intro~~");
    }

    @Override
    public String toString() {
        return "TravelClub{" +
                "id='" + id + '\'' +
                ", clubName='" + clubName + '\'' +
                ", intro='" + intro + '\'' +
                ", foundationDay='" + foundationDay + '\'' +
                '}';
    }
}
