# Password Research
 
The objective of this project is to find out which password composition/combinations is more resistant to password hacking. 
I will be using a hacking tool called Hashcat to perform all or most of the tests.

Password generators:
I used an online password generator (https://manytools.org/network/password-generator/) and made my own password generators in Java (see PasswordGenerators folder). I put them all in an MD5 encryptor to create my hashes (https://www.miraclesalad.com/webtools/md5.php).

How to use:
I used a Windows OS to operate hashcat. To use hashcat, control the directory to hashcat in command prompt. Then you can use the hashcat executable to start simulating password attacks.
Example command in windows command prompt (hashcat64.exe -m 0 -a 0 hashes\MD5lower.txt wordlists\rockyou.txt).

Put wordlists and hashes in hashcat folder. Download rockyou.txt from (https://www.kaggle.com/wjburns/common-password-list-rockyoutxt) and put the txt file in wordlists folder.

Hashcat tutorial: 
https://www.youtube.com/watch?v=EfqJCKWtGiU&t=