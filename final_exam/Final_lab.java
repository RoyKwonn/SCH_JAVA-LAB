package final_exam;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Final_lab extends JFrame {

	JTextField itemName;
	JTextField totalCost;
	JTextField cost;
	int totalCostInt;
	
	SpinnerNumberModel numberModel;
	
	
	
	// -------------------------------------------------
	// 수량과 가격에 대하여 총 가격을 구하는 액션
	
	class TotalCostListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int op1 = Integer.parseInt(cost.getText());
			int op2 = (int)numberModel.getValue();
			totalCostInt += (op1*op2);
			totalCost.setText("" + totalCostInt);
			//cost.requestFocus();
			
		}
		
	}
	// --------------------------------------------------
	
	
	Final_lab()
	{
		setTitle("홈 재고 관리 시스템");
		setSize(800, 500);
		JMenuBar menuBar = new JMenuBar();
		
		// setIconImage(IconImage) : 창 위에 표시할 아이콘을 나타낸다.
		
		
		// -------------------------------------------------
		// Top Down menu
		
		JMenu menu = new JMenu("File");
		menu.add(new JMenuItem("Open"));
		menu.add(new JMenuItem("Save"));
		menu.add(new JMenuItem("Exit"));
		menuBar.add(menu);
		
		menuBar.add(new JMenu("Edit"));
		menuBar.add(new JMenu("View"));
		menuBar.add(new JMenu("Tools"));
		menuBar.add(new JMenu("Help"));
		setJMenuBar(menuBar);
		
		// -----------------------------------------------------
		
		
		
		
		
		JPanel panel = new JPanel(new GridLayout(0,2));	// 메인 판넬
		
		
		
		// ------------------------------------------------------
		// Left
		
		JPanel panelLeft = new JPanel(new BorderLayout()); // 왼쪽 옵션 판넬 0x1
		JPanel panelItm = new JPanel(new GridLayout(0,1));
		

		// 아이템 내용을 적는 공간 1x1
		panelItm.add(new JLabel("Item Name"));
		itemName = new JTextField(15);
		panelItm.add(itemName);
		panelLeft.add(panelItm, BorderLayout.NORTH);
		
		
		
		// 구체적인 옵션을 선택하는 공간 nx2
		JPanel panelOpSe = new JPanel(new GridLayout(0,2)); // 왼쪽 아래  nx2
		JPanel panelManufac = new JPanel(new GridLayout(0, 1));
		
		
		// 제조사 표시
		panelManufac.add(new JLabel("Manufacturer"));
		String[] manufacturer = {"Layz Boy", "SeokHwan", "seokan"};
		JComboBox manufacturerlList = new JComboBox<Object>(manufacturer);
		manufacturerlList.setSelectedIndex(0);
		panelManufac.add(manufacturerlList);
		//panelManufac.setLayout(new FlowLayout(FlowLayout.LEADING)); // 좌로 정렬 (Leading, Center, Trailing)
		// FlowLayout(int align, int hgap, int vgap) // 공간 넓히기
		panelOpSe.add(panelManufac); // 제조사
		
		
		// 날짜 표시
		JPanel panelDate = new JPanel(new GridLayout(0, 1)); // 날짜 
		panelDate.add(new JLabel("Date Acquired"));
		JFormattedTextField date = new JFormattedTextField("2009.3.7");
		panelDate.add(date);
		panelOpSe.add(panelDate);
		
		
		// 모델과 스타일 표
		JPanel panelModSty = new JPanel(new GridLayout(0,1));
		panelModSty.add(new JLabel("Model or Style"));
		panelModSty.add(new JTextField(20));
		panelOpSe.add(panelModSty);
		
		
		// 시리얼 넘버 표시
		JPanel panelSerial = new JPanel(new GridLayout(0,1));
		panelSerial.add(new JLabel("Serial Number"));
		panelSerial.add(new JFormattedTextField("234-12-456"));
		panelOpSe.add(panelSerial);
		
		
		// 카테고리 표시
		JPanel panelCate = new JPanel(new GridLayout(0,1));
		panelCate.add(new JLabel("Category"));
		String[] category = {"Furniture", "Desk", "Electronic"};
		JComboBox categoryList = new JComboBox<Object>(category);
		panelCate.add(categoryList);
		panelOpSe.add(panelCate);
		
		
		// 제품 상태 표시(쌔거, 흔거, 중고)
		JPanel panelStatus = new JPanel(new GridLayout(0,1));
		panelStatus.add(new JLabel("Status"));
		String[] status = {"In Use", "new"};
		JComboBox statusList = new JComboBox<Object>(status);
		panelStatus.add(statusList);
		panelOpSe.add(panelStatus);
		
		
		// 현재 제품이 있는 위치 표시
		JPanel panelLocation = new JPanel(new GridLayout(0,1));
		panelLocation.add(new JLabel("Location"));
		String[] location = {"Den", "Kor", "USA"};
		JComboBox locationList = new JComboBox<Object>(location);
		panelLocation.add(locationList);
		panelOpSe.add(panelLocation);
		
		
		// 제품의 상태 표시(깔끔, 스크래치유무)
		JPanel panelCondition = new JPanel(new GridLayout(0,1));
		panelCondition.add(new JLabel("Condition"));
		String[] condition = {"Excellent", "good", "bad"};
		JComboBox conditionList = new JComboBox<Object>(condition);
		panelCondition.add(conditionList);
		panelOpSe.add(panelCondition);
		
		
		// 체크박스 추가
		panelOpSe.add(new JCheckBox("Engraved"));
		panelOpSe.add(new JCheckBox("Insured"));
		
		
		// 누구에게서 구입 했는지? 표시
		JPanel panelPurchasedFrom = new JPanel(new GridLayout(0,1));
		panelPurchasedFrom.add(new JLabel("Purchased From"));
		String[] purchasedFrom = {"권석환", "홍길동", "김철수"};
		JComboBox purchasedFromList = new JComboBox<Object>(purchasedFrom);
		panelPurchasedFrom.add(purchasedFromList);
		panelOpSe.add(panelPurchasedFrom);
		
		
		// 제품의 보증기간 표시
		JPanel panelWarranty = new JPanel(new GridLayout(0,1));
		panelWarranty.add(new JLabel("Warranty"));
		String[] warranty = {"90 Days", "60 Days", "30 Days"};
		JComboBox warrantyList = new JComboBox<Object>(warranty);
		panelWarranty.add(warrantyList);
		panelOpSe.add(panelWarranty);
		
		
		// 제품의 수량 표시
		JPanel panelQuantity = new JPanel(new GridLayout(0,1));
		panelQuantity.add(new JLabel("Quantity"));
		numberModel = new SpinnerNumberModel();
		JSpinner spinner = new JSpinner(numberModel);
		panelQuantity.add(spinner);
		panelOpSe.add(panelQuantity);
		
		
		// 누구에게 물려받았는지 표시
		JPanel panelHeir = new JPanel(new GridLayout(0,1));
		panelHeir.add(new JLabel("Heir"));
		String[] heir = {"None Designated", "A", "B"};
		JComboBox heirList = new JComboBox<Object>(heir);
		panelHeir.add(heirList);
		panelOpSe.add(panelHeir);
		
		// 개별 요금 표시
		JPanel panelCostEach = new JPanel(new GridLayout(0,1));
		panelCostEach.add(new JLabel("Cost Each"));
		cost = new JTextField(10);
		cost.addActionListener(new TotalCostListener());
		panelCostEach.add(cost);
		panelOpSe.add(panelCostEach);
		
		// 전체 요금 표시 (수량과 개별요금 합산하여 출력됨)
		JPanel panelCostTotal = new JPanel(new GridLayout(0,1));
		panelCostTotal.add(new JLabel("Total Cost"));
		totalCost = new JTextField(10);
		totalCost.setEditable(false);
		panelCostTotal.add(totalCost);
		panelOpSe.add(panelCostTotal);
		
		
		// 현재 가치 표시
		JPanel panelCurrentValue = new JPanel(new GridLayout(0,1));
		panelCurrentValue.add(new JLabel("Current Value"));
		JTextField currentValue = new JTextField(10);
		panelCurrentValue.add(currentValue);
		panelOpSe.add(panelCurrentValue);
		
		
		// 전체적인 현재 가치 표시
		JPanel panelTotalValue = new JPanel(new GridLayout(0,1));
		panelTotalValue.add(new JLabel("Total Value"));
		JTextField totalValue = new JTextField(10);
		totalValue.setEditable(false);
		panelTotalValue.add(totalValue);
		panelOpSe.add(panelTotalValue);
		
		panelLeft.add(panelOpSe, BorderLayout.CENTER);
		
		// ----------------------------------------------------------------------------
		
		
		
		// ---------------------------------------------------------------------------
		// 오른쪽 화면 표시
		
		JPanel panelRight = new JPanel(new BorderLayout()); // 오른쪽 설명
		
		
		// 이미지 표시
		JPanel panelImg = new JPanel();
		ImageIcon icon = new ImageIcon("/Users/skan/eclipse-workspace/sch/src/final_exam/sofa.jpg");
		JLabel label = new JLabel();
		label.setIcon(icon);
		panelImg.add(label);
		panelRight.add(panelImg, BorderLayout.NORTH);
		
		
		// 제품 설명 표시
		JPanel panelDes = new JPanel();
		JTextArea textArea = new JTextArea(10,30);
		textArea.append("설명이 여기에 들어갈 것입니다.");
		panelDes.add(textArea);
		
		
		panelRight.add(panelDes, BorderLayout.CENTER);
		
		// ------------------------------------------------------------------------------
		
		
		panel.add(panelLeft);
		panel.add(panelRight);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Final_lab f = new Final_lab();
	}

}
