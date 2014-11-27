public class main {

	//public static treeNode root;
	
	public static treeNode[] Tree; 

	public static void main(String[] args) {
		Tree = new treeNode[121];
		createTree();
		algorithm();
	}

	public static void createTree() {
		Tree[0] = new treeNode(0,0,0,0,0);
		Tree[1] = new treeNode(0,0,75,2,3);
		Tree[2] = new treeNode(0,1,95,4,5);
		Tree[3] = new treeNode(1,0,64,5,6);
		Tree[4] = new treeNode(0,2,17,7,8);
		Tree[5] = new treeNode(2,3,47,8,9);
		Tree[6] = new treeNode(3,0,82,9,10);
		Tree[7] = new treeNode(0,4,18,11,12);
		Tree[8] = new treeNode(4,5,35,12,13);
		Tree[9] = new treeNode(5,6,87,13,14);
		Tree[10] = new treeNode(6,0,10,14,15);
		Tree[11] = new treeNode(0,7,20,16,17);
		Tree[12] = new treeNode(7,8,4,17,18);
		Tree[13] = new treeNode(8,9,82,18,19);
		Tree[14] = new treeNode(9,10,47,19,20);
		Tree[15] = new treeNode(10,0,65,20,21);
		Tree[16] = new treeNode(0,11,19,22,23);
		Tree[17] = new treeNode(11,12,1,23,24);
		Tree[18] = new treeNode(12,13,23,24,25);
		Tree[19] = new treeNode(13,14,75,25,26);
		Tree[20] = new treeNode(14,15,3,26,27);
		Tree[21] = new treeNode(15,0,34,27,28);
		Tree[22] = new treeNode(0,16,88,29,30);
		Tree[23] = new treeNode(16,17,2,30,31);
		Tree[24] = new treeNode(17,18,77,31,32);
		Tree[25] = new treeNode(18,19,73,32,33);
		Tree[26] = new treeNode(19,20,7,33,34);
		Tree[27] = new treeNode(20,21,63,34,35);
		Tree[28] = new treeNode(21,0,67,35,36);
		Tree[29] = new treeNode(0,22,99,37,38);
		Tree[30] = new treeNode(22,23,65,38,39);
		Tree[31] = new treeNode(23,24,4,39,40);
		Tree[32] = new treeNode(24,25,28,40,41);
		Tree[33] = new treeNode(25,26,6,41,42);
		Tree[34] = new treeNode(26,27,16,42,43);
		Tree[35] = new treeNode(27,28,70,43,44);
		Tree[36] = new treeNode(28,0,92,44,45);
		Tree[37] = new treeNode(0,29,41,46,47);
		Tree[38] = new treeNode(29,30,41,47,48);
		Tree[39] = new treeNode(30,31,26,48,49);
		Tree[40] = new treeNode(31,32,56,49,50);
		Tree[41] = new treeNode(32,33,83,50,51);
		Tree[42] = new treeNode(33,34,40,51,52);
		Tree[43] = new treeNode(34,35,80,52,53);
		Tree[44] = new treeNode(35,36,70,53,54);
		Tree[45] = new treeNode(36,0,33,54,55);
		Tree[46] = new treeNode(0,37,41,56,57);
		Tree[47] = new treeNode(37,38,48,57,58);
		Tree[48] = new treeNode(38,39,72,58,59);
		Tree[49] = new treeNode(39,40,33,59,60);
		Tree[50] = new treeNode(40,41,47,60,61);
		Tree[51] = new treeNode(41,42,32,61,62);
		Tree[52] = new treeNode(42,43,37,62,63);
		Tree[53] = new treeNode(43,44,16,63,64);
		Tree[54] = new treeNode(44,45,94,64,65);
		Tree[55] = new treeNode(45,0,29,65,66);
		Tree[56] = new treeNode(0,46,53,67,68);
		Tree[57] = new treeNode(46,47,71,68,69);
		Tree[58] = new treeNode(47,48,44,69,70);
		Tree[59] = new treeNode(48,49,65,70,71);
		Tree[60] = new treeNode(49,50,25,71,72);
		Tree[61] = new treeNode(50,51,43,72,73);
		Tree[62] = new treeNode(51,52,91,73,74);
		Tree[63] = new treeNode(52,53,52,74,75);
		Tree[64] = new treeNode(53,54,97,75,76);
		Tree[65] = new treeNode(54,55,51,76,77);
		Tree[66] = new treeNode(55,0,14,77,78);
		Tree[67] = new treeNode(0,56,70,79,80);
		Tree[68] = new treeNode(56,57,11,81,82);
		Tree[69] = new treeNode(57,58,33,82,83);
		Tree[70] = new treeNode(58,59,28,83,84);
		Tree[71] = new treeNode(59,60,77,84,85);
		Tree[72] = new treeNode(60,61,73,85,86);
		Tree[73] = new treeNode(61,62,17,86,87);
		Tree[74] = new treeNode(62,63,78,87,88);
		Tree[75] = new treeNode(63,64,39,88,89);
		Tree[76] = new treeNode(64,65,68,89,90);
		Tree[77] = new treeNode(65,66,17,90,91);
		Tree[78] = new treeNode(66,0,57,91,92);
		Tree[79] = new treeNode(0,67,91,93,94);
		Tree[80] = new treeNode(67,68,71,94,95);
		Tree[81] = new treeNode(68,69,52,95,96);
		Tree[82] = new treeNode(69,70,38,96,97);
		Tree[83] = new treeNode(70,71,17,97,98);
		Tree[84] = new treeNode(71,72,14,98,99);
		Tree[85] = new treeNode(72,73,91,99,100);
		Tree[86] = new treeNode(73,74,43,100,101);
		Tree[87] = new treeNode(74,75,58,101,102);
		Tree[88] = new treeNode(75,76,50,102,103);
		Tree[89] = new treeNode(76,77,27,103,104);
		Tree[90] = new treeNode(77,78,29,104,105);
		Tree[91] = new treeNode(78,0,48,105,106);
		Tree[92] = new treeNode(0,79,63,107,108);
		Tree[93] = new treeNode(79,80,66,108,109);
		Tree[94] = new treeNode(80,81,4,109,110);
		Tree[95] = new treeNode(81,82,68,110,111);
		Tree[96] = new treeNode(82,83,89,111,112);
		Tree[97] = new treeNode(83,84,53,112,113);
		Tree[98] = new treeNode(84,85,67,113,114);
		Tree[99] = new treeNode(85,86,30,114,115);
		Tree[100] = new treeNode(86,87,73,115,116);
		Tree[101] = new treeNode(87,88,16,116,117);
		Tree[102] = new treeNode(88,89,69,117,118);
		Tree[103] = new treeNode(89,90,87,118,119);
		Tree[104] = new treeNode(90,91,40,119,120);
		Tree[105] = new treeNode(91,0,31,120,121);
		Tree[106] = new treeNode(0,92,4,0,0);
		Tree[107] = new treeNode(92,93,62,0,0);
		Tree[108] = new treeNode(93,94,98,0,0);
		Tree[109] = new treeNode(94,95,27,0,0);
		Tree[110] = new treeNode(95,96,23,0,0);
		Tree[111] = new treeNode(96,97,9,0,0);
		Tree[112] = new treeNode(97,98,70,0,0);
		Tree[113] = new treeNode(98,99,98,0,0);
		Tree[114] = new treeNode(99,100,73,0,0);
		Tree[115] = new treeNode(100,101,93,0,0);
		Tree[116] = new treeNode(101,102,38,0,0);
		Tree[117] = new treeNode(102,103,53,0,0);
		Tree[118] = new treeNode(103,104,60,0,0);
		Tree[119] = new treeNode(104,105,4,0,0);
		Tree[120] = new treeNode(105,0,23,0,0);
	}
	
	public static void algorithm() {
		Tree[1].Cvalue = 100 - Tree[1].value;
		for(int i = 2;i<Tree.length;i++) {
			treeNode leftP = Tree[Tree[i].leftParent];
			treeNode rightP = Tree[Tree[i].rightParent];
			treeNode minP;
			if(leftP.Cvalue<rightP.Cvalue) {
				minP = leftP;
				if(minP.equals(Tree[0])) {
					minP = rightP;
				}
			} else {
				minP = rightP;
				if(minP.equals(Tree[0])) {
					minP = leftP;
				}
			}
			Tree[i].Cvalue = minP.Cvalue + (100-Tree[i].value);
		}
		
		treeNode min = Tree[Tree.length-15];
		for(int i=Tree.length-14;i<Tree.length;i++) {
			if(Tree[i].Cvalue<min.Cvalue) {
				min=Tree[i];
			}
		}
		
		int total = min.value;
		treeNode current = min;
		System.out.println(min.value);
		System.out.println("At while");
		while(current!=Tree[1]) {
			if(Tree[current.leftParent].Cvalue<Tree[current.rightParent].Cvalue) {
				treeNode tmp = Tree[current.leftParent];
				if(tmp.equals(Tree[0])) {
					tmp = Tree[current.rightParent];
				}
				current = tmp;
			} else {
				treeNode tmp = Tree[current.rightParent];
				if(current.equals(Tree[0])) {
					tmp = Tree[current.leftParent];
				}
				current = tmp;
			}
			total += current.value;
		}
		
		System.out.println("Total: " + total);
		
	}

}
