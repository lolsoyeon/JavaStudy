import java.util.Scanner;
public class PROJECT_0706 {
	
	   static int minmoney = 7000; // ���ϱݾ�
	   // -------------------------------------------����� �Լ� 
	   // �޴� ��� �Լ�
	   static void menu(int[][] fpriceCnt, String[] flower) {
		 //int[][] fpriceCnt = { { 7000, 3 }, { 15000, 7 }, { 20000, 4 }, { 15000, 0 }, { 12000, 3 } }; // ��ǰ����&���
	      System.out.println(" ====================�� Flower Machine ��==================");
	      System.out.println("                 �� ����ϴ� ������� ������ ���ϼ���  ��            \n");
	      System.out.println("                          [MENU]                          \n");
	      for (int i = 0; i < fpriceCnt.length; i++) {
	         System.out.print("["+(i + 1)+"]"+ flower[i] + " ");
	         System.out.print(fpriceCnt[i][0] + "��  ");
	      }
	      System.out.println("\n\n"); // �ٹٲ�
	   }

	   // �ݾ� ������ ��ȯ�ϴ� �Լ�
	   static int changeMoney(int money) {
	      if (money < minmoney) { // ���ϱݾ׺��� ������
	         System.out.println("[ERROR!!] �ݾ��� �����մϴ�  o��o;");
			money = CashReturn(money); // ���ݹ�ȯ �Լ�ȣ��
	      }
	      return money; 
	   }
		// ���� ��ȯ�ϴ� �Լ�
		static int CashReturn(int money){
			int mCount[][] = { { 10000, 5000, 1000, 500, 100,10,1 } , {0,0,0,0,0,0,0} }; // ���������� ���� ���߹迭
			// ��ȯ ���� ī����
		   if (money > 0) { // ��ȯ�� �ݾ��� 0���� ũ��
	        	System.out.println(money+" �� ��ȯ�˴ϴ�.");
	            for (int i = 0; money > 0;) { // �ܵ��� 0�� �ɶ����� �ݺ�
	                if (money >= mCount[0][i] ) { // 10000..500..100�� ���� ���� �۰ų� ������?
	                	mCount[1][i]++;	// ���� cnt++;
	                    money -= mCount[0][i]; // ����� �������ŭ �ܵ� ���� 
	                }
	                else {
	                	i++;
	                }
	            }//for1
	            // �� �������� ���
	            for (int i = 0; i < 5; i++) {//�������� ������ŭ �ݺ�
	                if (mCount[1][i]==0) { // ���󸶴� ��ȯ�� ������ ���ٸ�, �ǵ��ư���.
	                    continue;
	                }
	                else { // ��µ� ���� �ȳ�
	                	System.out.println("  - "+mCount[0][i]+"��: "+mCount[1][i]+" ��(��) ");
	            }
	                
	        }//for2
            System.out.println("\n");// ������
			
		}//if>0 
	        else {
	        	System.out.println("��ȯ�ݾ� =" + money+"\n"); // money 
	        }
		   
		   return money; // ���� money ��ȯ
		   
		}//CashReturn�Լ�����

	   // -------------------------------------------������ ���� �Լ�
	   // ������ ��� �޴� ���&�޴���ȣ �Է�
	   final static int managerpw = 1004; // ������ ��й�ȣ
	   
	   static void managerMenu() {
	      System.out.println("[1]��ǰ����  [2]���ݺ���  [3]������  [4]�����ڸ�� ����");
	      System.out.print("���� �޴� ���� : ");
	   }
	   
	   // ������ ��� �޴�����, ���뺯�� �Լ�
	   static Boolean MaNager(int[][] fpriceCnt, String[] flower) {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("������ ��й�ȣ �Է� : "); // ������ ��й�ȣ = 1004
	      int pswd = sc.nextInt();
	      if (pswd == managerpw) {
	         System.out.println("[ ������ ��� ] �� �����ϼ̽��ϴ� :D ");
	      } else {
	         System.out.println("[Error] ��й�ȣ�� Ʋ�Ƚ��ϴ�.\nXXXXXX ���ٺҰ� XXXXXX\n");
	         return true; // �����ڸ������
	      }
	      
	      // ������ ��ǰ ����  ����
	      int productNum;
	      
	      // �޴���ȣ ��ȿ���˻�
	      while(true) { 
	    	   System.out.print("\n������ ��ǰ��ȣ �Է� : ");
		       productNum = sc.nextInt();
		       if(1 <= productNum && productNum <= 5) { // 1~5����
		    	   break;
		       }
		       System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���!( 1~5 )\n");
	      }
	     
	      System.out.println("\n[ " + flower[productNum-1] + " ] ��ǰ�� ���õǾ����ϴ�.\n");
	      
	      // ��ǰ���� �޴� ���� �Լ�
	      int cateGoryNum; // ī�װ� �ѹ�
	      
	      // "������ ����"�� ������ �ݺ�
	      while(true) { 
	    	  managerMenu();
		      cateGoryNum = sc.nextInt(); // ī�װ� �Է�
	      //ī�װ� ��ȣ ��ȿ���˻�
	      while(true) {
		      if(1 <= cateGoryNum && cateGoryNum <= 4) { // 1~4����
		    	  break;
		      }
		      System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���!( 1~4 )\n");
	      }
	      if (cateGoryNum < 4) { // ���ᰡ �ƴ϶��
	         if (cateGoryNum == 1) { // ��ǰ����
	            System.out.print("������ ��ǰ�� : ");
	            flower[productNum-1] = sc.next();
	            System.out.println(flower[productNum-1] + "(��)�� ��ǰ�� ����Ǿ����ϴ�.\n");
	         }
	         else if (cateGoryNum == 2) { // ��ǰ���ݺ���
	            System.out.println("���� " + flower[productNum-1] + "�� �ݾ��� " + fpriceCnt[productNum-1][0] + "�� �Դϴ�.\n");
	            System.out.print("������ �ݾ��� �Է����ּ��� : ");
	            fpriceCnt[productNum-1][0] = sc.nextInt();
	            System.out.println(fpriceCnt[productNum-1][0] + "�� ���� �ݾ��� ����Ǿ����ϴ�.\n");
	         } else if (cateGoryNum == 3) { // ������
	            System.out.println("���� " + flower[productNum-1] + "�� �ܿ����� " + fpriceCnt[productNum-1][1] + "��  �Դϴ�.\n");
	            System.out.print("�߰��Ͻ� ��ǰ ���� �Է����ּ��� : ");
	            int add = sc.nextInt(); // �߰� ��� ��
	            fpriceCnt[productNum-1][1] += add;
	            System.out.println("�԰� �Ϸ�Ǿ����ϴ�.\n���� ��� :  " + fpriceCnt[productNum-1][1] + "��  �Դϴ�.\n");
	         }
	      } // 1~3ī�װ�

		  public static void main(String[] args)
		{
				Scanner sc = new Scanner(System.in);
	         // �迭�غ�
	         String[] flower = { "�Ȱ���", "����", "���", "�عٶ��", "ī���̼�" };
	         int[][] fpriceCnt = { { 7000, 3 }, { 15000, 7 }, { 20000, 4 }, { 15000, 0 }, { 12000, 3 } }; // ��ǰ����&���
	         //[S]�ڡڡ�[T]�ڡڡ�[A]�ڡڡڡ�[R]�ڡڡڡ�[T]�ڡڡڡڡڡڡڡڡڡڡ�                                                                                              // ����Ǿ��ִ�
	        while (true) {       // ������ ��� ����� ����� ��� �ݿ��� ���� �ݺ��� ���                            // ���߹迭
	         // ����ڸ�� �� �����ڸ�� ������ ����
	         System.out.println(" [1]����ڸ��   [2]�����ڸ��  [3]���α׷� ����");
	         System.out.print("�޴� ���� :  ");
	         int modeSelect = sc.nextInt(); // ����� ��� �� ������ ��� ����

	         if (modeSelect == 2) {
	            // [�Լ�ȣ��]
	            if (MaNager(fpriceCnt, flower)) {
	               System.out.println("�����ڸ�带 �����մϴ� :��\n");
	               continue;
	            }
	         } else if (modeSelect == 1) { // "����� ���" �ڵ� ����
             } else if (modeSelect == 3) {
	         		System.out.println("\n                  ���α׷��� �����մϴ� :D\n�̿����ּż� �����մϴ�  ��u���� ������ �� �̿����ּ��� ��  ");
					break;
				}else {
					System.out.println("\n                 �߸��� �Է��Դϴ� :-( \n          �ٽ� �Է����ּ���  1 / 2 / 3\n");

				} // ��� ���� 

			  }
	
		  }//main
	   }
}