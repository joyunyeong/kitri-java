/*
���������� ����
1. 0(����), 1(����), 2(��)
2. �� : ����(0, 1, 2)
3. ��� Logic (��, ��, ��)
4. ��� ���
	�� : ��, �� : ���� ��� : �̰��.
	�� : ��, �� : ���� ��� : ���.
	�� : ��, �� : �� ��� : ����.
*/
public class GBB { //�����
	public static void main(String[] args) {
		int my = 0; //���� ��
		int com = (int) (Math.random() * 3); // random : 0<ran<1
		String resultStr; 
		int result = (my - com + 2) % 3; //3���� ������ ������ 2���� ���� ���� 4���� ���ü��� �־
		String my_kor, com_kor, res;

		if ((my == 0 && com == 1) || (my==1 && com == 2) || (my==2 && com == 0)) {
			res = "�̰��."; //(0,1) (1, 2) (2,0)
		}	else if ((my == 0 && com == 2) || (my==1 && com == 0) || (my==2 && com == 1)) {
			res = "����.";  // (0, 2), (1,0) (2, 1)
		}	else {
			res = "����.";
		}


		// ����,����,�� ��, ��ǻ�� �� ����
		switch(my) {
			case 0 : my_kor = "�ָ�"; break;
			case 1 : my_kor = "����"; break;
			 default : my_kor = "��";
		}

		switch(com) {
			case 0 : com_kor = "�ָ�"; break;
			case 1 : com_kor = "����"; break;
			 default : com_kor = "��";
		}
/*

		if (my==0 || com==0) {
			my_kor = "�ָ�";
			com_kor = "�ָ�";
			}	else if (my==1 || com==1) {
				my_kor = "����";
				com_kor = "����";
			}	else {
				my_kor = "��";
				com_kor = "��";
			}
	} */
				System.out.println("�� : " + my_kor +", �� : " + com_kor);
				System.out.println(res);

	}
}








/*	����� version.	

		if (result == 0) {
			resultStr = "����.";
		}	else if (result == 1) {
			resultStr = "�̰��.";		
		}	else {
			resultStr = "����.";
		}

		switch(my) {
			case 0 : my_kor = "�ָ�"; break;
			case 1 : my_kor = "����"; break;
			 default : my_kor = "��";
		}

		switch(com) {
			case 0 : com_kor = "�ָ�"; break;
			case 1 : com_kor = "����"; break;
			 default : com_kor = "��";
		}
				System.out.println("�� : " + my_kor +", �� : " + com_kor);
				System.out.println(resultStr);
	}
}

*/