package exam_inner_class;

public class Button {
	OnClickListener listener;

	public Button(OnClickListener listener) {
		super();
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}

}
