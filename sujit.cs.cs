using System;
using SYstem.Collections.Generic;
using System.Data;
using System.Linq;
using System.text;

namespace ComparativeAnalysis {
        
class Program
{
static void Main(string[]args)
{
Analysis analysis = new Analysis();
Console.WriteLine(analysis.GetResult[]);
Console.ReadKey[];
}
}
public class Analysis
{
Data Table surveys2017 = new Data Table();
Data Table surveys2018 = new Data Table();
Data Table answers = new Data Table[];
public Analysis();
public Analysis()
{
YearWiseSurvey2017();
YearWiseSurvey2018();
YearWiseResponse();
}
//list of survey attend by each company in 2017.
 private void YearWiseSurvey2017()
{
surveys2017.Columns.Add("Id");
surveys2017.Columns.Add("company name");
surveys2017.Column.Add("year");
}
surveys2017.Rows.Add("S1", "APPLE", "2017");
surveys2017.Rows.Add("S2", "GOOGLE", "2017");
surveys2017.Rows.Add("S3", "SPACEX", "2017");
}
//list of survey attend by each company in 2018.

 private void YearWiseSurvey2018()
{
surveys2018.Columns.Add("Id");
surveys2018.Columns.Add("company name");
surveys2018.Column.Add("year");
}
surveys2018.Rows.Add("S4", "APPLE", "2018");
surveys2018.Rows.Add("S5", "GOOGLE", "2018");
surveys2018.Rows.Add("S6", "SPACEX", "2018");
}

//Addind answer for questions for each company in 2017 and 2018 time period

private void YearWiseResponse()
{
answers.Columns.Add("surveyID", typeof(string));
answers.Columns.Add("feamle_employee", typeof(decimal));
answers.Columns.Add("male_employee", typeof(decimal));

answers.Rows.Add("S1", "22500", "48522");
answers.Rows.Add("S2", "32500", "58522");
answers.Rows.Add("S3", "42500", "68522");
answers.Rows.Add("S4", "52500", "78522");
answers.Rows.Add("S5", "62500", "98522");
answers.Rows.Add("S6", "72500", "38522");
}

//CALL THE FUNCTION HERE TO GET THE RESULT.

public string GetResult()
{
return "Comparative Analysis - Code Assignment" + Environment.NewLine
                                                + "----------------------------------" + Environment.NewLine + Environment.NewLine
						+ " list of company names who have increased in number of employee in 2018----- and ------";
}







