package Proj6;

public class seatClass {
	private int EC = 4;
	private int BC = 3;
	private int FC = 2;

	public void allocateClass(Ticket ticket) {
		if (EC != 0 && ((ticket.seatClass.equals("EC")))) {
			EC -= 1;
			ticket.setTicketStatus("booked Economy Class");
		} else if (BC != 0 && ticket.seatClass.equals("BC")) {
			BC -= 1;
			ticket.setTicketStatus("booked Business Class");
		} else if (FC != 0 && ticket.seatClass.equals("FC")) {
			FC -= 1;
			ticket.setTicketStatus("booked First Class");
		} else {
			if (EC != 0) {
				ticket.setTicketStatus("booked Economy Class");
			} else if (BC != 0) {
				ticket.setTicketStatus("booked Business Class");
			} else {
				ticket.setTicketStatus("booked First Class");
			}
		}
	}
}
