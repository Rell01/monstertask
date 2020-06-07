package com.monster.task;

import org.junit.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open; 

import com.codeborne.selenide.Condition;

public class MonsterTest {
  @Test
  public void userCanSearch() {
    open("https://www.monsterworksdemo.com/home/");

    $("#dropdown-scrollable-container > div > div:nth-child(3)").click();
    $("#modal-body > div > ng-form > form > div > div > div > div.create-account-link > div > a").click();
    $("#a_elem_0").setValue("Test1");
    $("#a_elem_1").setValue("Test2");
    $("#a_elem_4").setValue("123456");
    $("#a_elem_5").setValue("123456");
    $("#elem_6").setValue("01");
    $("#elem_6").sendKeys(Keys.ARROW_RIGHT, Keys.ARROW_DOWN, Keys.ARROW_RIGHT, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN);
    $("#elem_7").selectOption(1);
    $("#option_label_elem_2-26950 > span").click();
    $("#id_option_label_elem_3-2008 > span.radio-custom").click();
    $("#main-content > div > div.ng-scope > div > div > div > div > ng-form > div > uib-accordion > div > div:nth-child(1) > ng-form > div > div.panel-collapse.collapse.in > div > div > button").click();
    $("#main-content > div > div.ng-scope > div > div > div > div.ng-isolate-scope > ng-form > div > uib-accordion > div > div:nth-child(2) > ng-form > div > div.panel-collapse.in.collapse > div").click();
    
    $("#a_elem_0").waitUntil(Condition.hidden, 5000);
    $("#c_elem_8").waitUntil(Condition.visible, 5000);
    $("#c_elem_8").setValue("test11@test.com");
    $("#a_elem_11").setValue("ZpQDHC%041#0");
    $("#a_elem_12").setValue("ZpQDHC%041#0");
    $("#elem_9").selectOption(1);
    $("#a_elem_13").setValue("blablablabla");
    $("#a_elem_10").setValue("test11@test.com");
    $("#main-content > div > div.ng-scope > div > div > div > div.ng-isolate-scope > ng-form > div > uib-accordion > div > div:nth-child(2) > ng-form > div > div.panel-collapse.in.collapse > div > div > button").click();

    $("#c_elem_8").waitUntil(Condition.hidden, 5000);
    $("#address-location-autocomplete").waitUntil(Condition.visible, 5000);
    $("#address-location-autocomplete").waitUntil(Condition.visible, 5000);
    $("#address-location-autocomplete").waitUntil(Condition.visible, 5000);
    $("#main-content > div > div.ng-scope > div > div > div > div.ng-isolate-scope > ng-form > div > uib-accordion > div > div:nth-child(3) > ng-form > div > div.panel-collapse.in.collapse > div > ng-include > div:nth-child(2) > button").click();
    
   
    $("#a_elem_14").sendKeys(Keys.NUMPAD0, Keys.NUMPAD0, Keys.NUMPAD0, Keys.NUMPAD0, Keys.NUMPAD0, Keys.NUMPAD0, Keys.NUMPAD0, Keys.NUMPAD0, Keys.NUMPAD0, Keys.NUMPAD0);
    $("#elem_15").selectOption(1);
    $("#elem_20").selectOption(1);
    $("#main-content > div > div.ng-scope > div > div > div > div.ng-isolate-scope > ng-form > div > uib-accordion > div > div:nth-child(3) > ng-form > div > div.panel-collapse.in.collapse > div > div > button").click();
  
    $("#id_option_label_elem_29-2009").click();
    $("#option_label_elem_30-2009 > span").click();
    $("#main-content > div > div.ng-scope > div > div > div > div.ng-isolate-scope > ng-form > div > uib-accordion > div > div:nth-child(4) > ng-form > div > div.panel-collapse.in.collapse > div > div > button").click();
    
  }
}