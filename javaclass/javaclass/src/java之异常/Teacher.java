package java之异常;

public class Teacher {
    public void checkScore(int score) throws ScoreException{
        if (score<0||score>100){
            throw new ScoreException("你的输入有误");
        }
        else {
            System.out.println("分数正常");
        }
    }
}
