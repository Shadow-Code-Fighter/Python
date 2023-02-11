def chatbot():
    print("hi, I'm a Gaurav")
    while True:
        user_input= input("you : ")

        if user_input =="quit":
            print("chatbot: bye! have a great day")
            break
        elif user_input =="hi":
                print("chatbot: hello!")
        else:
                print("chatbot: sorry, i did not understand ")
            
if __name__ == "__main__":
    chatbot()