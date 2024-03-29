package lab;

public class Entry {
	public static void main(String[] args) {
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D", 0);
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");
		Node nodeG = new Node("G", -5);
		Node nodeN = new Node("N", 4);
		Node nodeO = new Node("O");
		Node nodeW = new Node("W", -3);
		Node nodeX = new Node("X", -5);
		Node nodeH = new Node("H", 3);
		Node nodeI = new Node("I", 8);
		Node nodeJ = new Node("J");
		Node nodeP = new Node("P", 9);
		Node nodeQ = new Node("Q", -6);
		Node nodeR = new Node("R", 0);
		Node nodeK = new Node("K");
		Node nodeS = new Node("S", 3);
		Node nodeT = new Node("T", 5);
		Node nodeL = new Node("L", 2);
		Node nodeM = new Node("M");
		Node nodeU = new Node("U", -7);
		Node nodeV = new Node("V", -9);
		nodeA.addChild(nodeB);
		nodeA.addChild(nodeC);
		nodeA.addChild(nodeD);
		nodeA.addChild(nodeE);
		nodeB.addChild(nodeF);
		nodeB.addChild(nodeG);
		nodeF.addChild(nodeN);
		nodeF.addChild(nodeO);
		nodeO.addChild(nodeW);
		nodeO.addChild(nodeX);
		nodeC.addChild(nodeH);
		nodeC.addChild(nodeI);
		nodeC.addChild(nodeJ);
		nodeJ.addChild(nodeP);
		nodeJ.addChild(nodeQ);
		nodeJ.addChild(nodeR);
		nodeE.addChild(nodeK);
		nodeE.addChild(nodeL);
		nodeE.addChild(nodeM);
		nodeK.addChild(nodeS);
		nodeK.addChild(nodeT);
		nodeM.addChild(nodeU);
		nodeM.addChild(nodeV);
		
		ISearchAlgo miniMaxSearch = new MiniMaxSearchAlgo();
		System.out.println("MiniMaxSearch");
		miniMaxSearch.execute(nodeA);
		System.out.println("----------------------------------------");
		System.out.println("alphaBetaLeftToRightSearch: ");
		AlphaBetaSearchAlgo alphaBetaSearch = new AlphaBetaSearchAlgo();
		alphaBetaSearch.execute(nodeA);
		System.out.println("----------------------------------------");
		System.out.println("alphaBetaRightToLeftSearch: ");
		
		AlphaBetaRightToLeftSearchAlgo alphaBetaRightToLeftSearch = new AlphaBetaRightToLeftSearchAlgo();
		alphaBetaRightToLeftSearch.execute(nodeA);
	}
}
