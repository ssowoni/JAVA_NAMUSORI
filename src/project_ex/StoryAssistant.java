package project_ex;

import project_ex.ui.menu.ClubMenu;

//프로그램의 시작점
public class StoryAssistant {

    private void startStory(){
    ClubMenu clubMenu = new ClubMenu();
    clubMenu.show();
    }


    public static void main(String[] args) {

       StoryAssistant assistant = new StoryAssistant();
        assistant.startStory();



    }
}
