def EstPalindrome(mot):
    mot = mot.replace(" ", " ")
    mot_inverse = mot[::-1]
    if mot.lower() == mot_inverse.lower():
        return print(f"Possible ! -> {mot[::-1]}")
    elif mot.lower() != mot_inverse.lower():
        return print(f"Impossible ! -> {mot[::-1]}")


# EstPalindrome()

def main():
    mot = input("Entrer un mot : ")
    EstPalindrome(mot)


main()
