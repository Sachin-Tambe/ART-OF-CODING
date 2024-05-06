import tkinter as tk
import re

class EmailValidatorApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Email Validator")
        self.root.geometry("300x200")
        
        
        self.root.configure(bg="#F0F0F0")
        
        self.label = tk.Label(root, text="Enter an email address:", font=("Arial", 12), bg="#F0F0F0")
        self.label.pack(pady=10)
        
        self.email_entry = tk.Entry(root, font=("Arial", 12))
        self.email_entry.pack()
        
        self.validate_button = tk.Button(root, text="Validate Email", command=self.validate_email, font=("Arial", 12) ,bg="Tomato")
        self.validate_button.pack(pady=10)
        
        self.clear_button = tk.Button(root, text="Clear", command=self.clear_entry, font=("Arial", 12))
        self.clear_button.pack(pady=5)
        
        self.result_label = tk.Label(root, text="", font=("Arial", 14), bg="#F0F0F0")
        self.result_label.pack()
    
    def validate_email(self):
        email = self.email_entry.get()
        if self.is_valid_email(email):
            self.result_label.config(text="Valid email address", fg="green")
        else:
            self.result_label.config(text="Invalid email address. Please check the format.", fg="red")
    
    def clear_entry(self):
        self.email_entry.delete(0, 'end')
        self.result_label.config(text="")
    
    def is_valid_email(self, email):
        email_pattern = r"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$"
        return re.match(email_pattern, email) is not None

if __name__ == "__main__":
    root = tk.Tk()
    app = EmailValidatorApp(root)
    root.mainloop()
