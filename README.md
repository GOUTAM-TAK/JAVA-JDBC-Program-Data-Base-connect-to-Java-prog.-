# JAVA-JDBC-Program-Data-Base-connect-to-Java-prog.-
Problem statement and steps to follow in program are =>
Refer to online voting case study
Prepare DAO, POJO layers , Write a simple tester/s to test it in standalone application.

1.1 User Authentication(validation)
(You can continue with day1.2)
OR
List all candidates
day1_lab
Table : candidates
POJO : Candidate
DBUtils : copy/ or write
DAO : CandidateDao i/f
List<Candidate> getAllCandidates() throws SE
CandidateDaoImpl
1. import : java.sql , import static : utils
2. state : cn , pst1
3. def ctor : openCn , pst1=cn.prepareStatement(sql);
4. clean up : close pst1, cn
5. getAllCandidates() : exec query --RST --while loop --ORM 


1.2 Add new Candidate

2. Add tomcat web server in Eclipse(STS 3.9.18) IDE.
(Refer : "day1-data\day1_help\Web Server n Java EE docs\Installation steps for Tomcat.txt")

Optional Hands on

1. Get all candidates.
2. Update Voting status
3. Increment candidate votes
