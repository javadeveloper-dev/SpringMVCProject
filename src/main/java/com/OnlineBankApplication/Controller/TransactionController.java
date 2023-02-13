package com.OnlineBankApplication.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.OnlineBankApplication.DAO.TransactionDAO;
import com.OnlineBankApplication.Entity.Transaction;
import com.OnlineBankApplication.Service.TransactionServcie;

@Controller
public class TransactionController {

	@Autowired
	private TransactionDAO transactionDAO;
	
	@Autowired
	private TransactionServcie transactionService;

	@RequestMapping("/TransactionSummary")
	public String transactionList(Model model) {
		List<Transaction> transaction = transactionService.getTransactions();
		model.addAttribute("transactions", transaction);
		return "TransactionSummary";
	}

	@RequestMapping("/TransactionForm")
	public String transactionForm() {
		return "TransactionForm";
	}
	
	@RequestMapping("/Welcome")
	public String welcome() {
		return "Welcome";
	}
	@RequestMapping("/transaction-handle")
	public String transactionHandler(@ModelAttribute Transaction transaction,Model model) {
		boolean flag=true;
		if(!transactionService.isValidAccountNo(transaction.getAccountNo())){
			model.addAttribute("messege","Enter the Valid Account No");
			model.addAttribute("transaction",transaction);
			flag=false;
		}
		if(transactionService.isValidName(transaction.getName())==false) {
			model.addAttribute("messegeForName","Enter the Valid Name ");
			model.addAttribute("transaction",transaction);
			flag=false;
		}
		if(transactionService.isValidPhoneNo(transaction.getPhoneNo())==false) {
			model.addAttribute("messegeForPhoneNo","Enter the Valid Phone No ");
			model.addAttribute("transaction",transaction);
			flag=false;
		}
		if(transactionService.isValidAmount(transaction.getAmount())==false){
			model.addAttribute("messegeForAmount","Enter the Valid Amount");
			model.addAttribute("transaction",transaction);
			flag=false;
		}
		if(flag) {
			transactionService.saveTransaction(transaction);
			return "TransactionSummary";
		}else {
			return "TransactionForm";
		}
	}

	@RequestMapping("/Transactions")
	public String transaction(Model model) {
		List<Transaction> transaction = transactionService.getTransactions();
		model.addAttribute("transactions", transaction);
		return "Transaction";
	}

	@RequestMapping("/update/{transactionId}")
	public String updateTransaction(@PathVariable("transactionId") int tid, Model model) {
		Transaction transaction = this.transactionDAO.getTransaction(tid);
		model.addAttribute("transaction", transaction);
		return "UpdateTransactionForm";
	}

	@RequestMapping("/delete/{transactionId}")
	public RedirectView deleteTransaction(@PathVariable("transactionId") int tid, Model model,
			HttpServletRequest request) {
		this.transactionService.deleteTransaction(tid);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/Transactions");
		return redirectView;
	}
}
