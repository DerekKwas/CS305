# Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

Artemis Financial is a consulting company that develops personalized financial plans such as savings, retirement, investments, and insurance for its customers. Artemis Financial is looking for a modernization of their custom software's security as it needs to protect their client's data and financial information, as well as keeping communications to the web app secure.  They are requesting that file verification steps are used for secure communications and that a data verification step in the form of a checksum is added when transferring client data. 

# What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

I believe I documented the client's software security vulnerabilities well when it comes to the software's dependencies.  Also noted in the report were vulnerabilities in the code itself that were found when conducting a manual review as well as a final mitigation plan to address these issues. Coding securely can help prevent vulnerabilities from being introduced into the system allowing for confidential data to be kept safe.  Having software security can add to a company's wellbeing by reassuring their clients that their sensitive data is safe and that attackers do not have access to it. 

# What part of the vulnerability assessment was challenging or helpful to you?

The most challenging part of the vulnerability assessment to me was figuring out what areas of security were the most vulnerable in the system.  I found this to be the most challenging as not knowing/seeing more about the system made it a little bit harder to determine what areas of the system could be open to vulnerabilities. 

# How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

I increased the layers of security by implementing an encryption algorithm cipher to secure the data being transferred as well as utilizing certificates to make use of HTTPS instead of HTTP for secure communications.  To access vulnerabilities in the future I would use the OWASP dependency check tool to find vulnerabilities in the included dependencies to determine which ones are allowing room for attacks.  This dependency check lists out known vulnerabilities as well as ways to fix them that can become very useful when dealing with 3rd party APIs.

# How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

To make certain the code and software application were functional I made sure to continuously compile and check that changes made to the code did not cause any errors during compilation or runtime.  After refactoring the code, I utilized the OWASP dependency check to verify that no new vulnerabilities were introduced to ensure that the software application was still secure.

# What resources, tools, or coding practices did you use that might
I believe that both Project One and Project Two are great examples for employers to see what I have successfully completed as Project One shows that I am able to find vulnerabilities in a Java application and document the findings and any plans to mitigate them.  Project Two is a great way to show off the completion of creating a web application that utilizes a certificate and encryption algorithm to keep data secure.
