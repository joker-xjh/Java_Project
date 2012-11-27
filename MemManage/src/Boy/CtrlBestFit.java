package Boy;

import java.util.*;
import java.awt.event.*;

public class CtrlBestFit implements ActionListener, KeyListener {
	private List<MemBlock> blockList;

	private MemFrame memFrame = null;
	
	// blockSize����Ҫ���ڴ�   UsedSize��ʹ�õ��ڴ�  largestSize��������ڴ�
	private int memNum, usedSize, largestSize;
	
	public CtrlBestFit(MemFrame memFrame) {
		this.memFrame = memFrame;
		memNum = 0;
		usedSize = 0;
		largestSize = Constants.memSize;
		blockList = new LinkedList<MemBlock>();
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO ���Ӱ�ťί�� best-fit
		Object event = e.getSource();
		if (event == memFrame.bestAllocButton)
			System.out.println("best alloc button");
		if (event == memFrame.bestFreeButton)
			System.out.println("best free button");
		if (event == memFrame.bestPackButton)
			System.out.println("best pack button");
//		if (event == memFrame.bestDemoButton)
//			System.out.println("best demo button");
//		if (event == memFrame.bestLogButton)
//			System.out.println("best log button");
	}

	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO ���ӻس��¼� best-fit
		if (e.getSource() == memFrame.bestAllocText)
			System.out.println("best alloc text");
		if (e.getSource() == memFrame.bestFreeText)
			System.out.println("best free text");
	}

	public void keyTyped(KeyEvent e) {
		
	}
}