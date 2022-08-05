import java.io.IOException;
public interface Mode
{
	public abstract void display();							//메뉴판을 보여줘야 한다 
	public abstract void select()throws IOException;		//관리자모드에서 선택하는 기능... 입력을 받고 선택하는 기능을 가지고 있음
	public abstract boolean selecting() throws IOException; //사용자모드에서 선택하는 기능... 관리자 모드로 나가기 위해 boolean활용

}