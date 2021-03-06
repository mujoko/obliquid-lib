package org.obliquid.junit;

import org.obliquid.datatype.BooleanTypeImplShould;
import org.obliquid.datatype.CountryTypeImplShould;
import org.obliquid.datatype.EmailAddressImplShould;
import org.obliquid.datatype.EmailListImplShould;
import org.obliquid.datatype.IpAddressImplShould;
import org.obliquid.datatype.IsoDateImplShould;
import org.obliquid.datatype.ItalianPostCodeImplShould;
import org.obliquid.datatype.LanguageTypeImplShould;
import org.obliquid.datatype.PasswordImplShould;
import org.obliquid.datatype.PhoneNumberImplShould;
import org.obliquid.datatype.UrlTypeImplShould;
import org.obliquid.datatype.UsernameImplShould;
import org.obliquid.datatype.VatPercentImplShould;
import org.obliquid.datatype.companytaxid.ItalianCompanyTaxIdShould;
import org.obliquid.date.DateBuilderShould;
import org.obliquid.date.DateHelperShould;
import org.obliquid.db.DbNullShould;
import org.obliquid.ec2.Ec2TagShould;
import org.obliquid.helpers.BdHelperShould;
import org.obliquid.helpers.SqlHelperShould;
import org.obliquid.helpers.StringHelperShould;
import org.obliquid.util.MapCacheShould;
import org.obliquid.util.MyImageShould;
import org.obliquid.util.StopWatchShould;
import org.obliquid.util.WgetShould;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test Suite for all tests that don't require a DB.
 * 
 * @author stivlo
 */
@RunWith(Suite.class)
@SuiteClasses(value = {
                //org.obliquid.datatype
                BooleanTypeImplShould.class, CountryTypeImplShould.class, EmailAddressImplShould.class,
                EmailListImplShould.class, IpAddressImplShould.class, IsoDateImplShould.class,
                ItalianPostCodeImplShould.class, LanguageTypeImplShould.class, PasswordImplShould.class,
                UsernameImplShould.class, VatPercentImplShould.class, PhoneNumberImplShould.class,
                UrlTypeImplShould.class,

                //org.obliquid.helpers
                StringHelperShould.class, SqlHelperShould.class,

                //org.obliquid.date
                DateHelperShould.class, DateBuilderShould.class,

                //other uncategorised tests
                StopWatchShould.class, DbNullShould.class, BdHelperShould.class, Ec2TagShould.class,
                WgetShould.class, ItalianCompanyTaxIdShould.class, MapCacheShould.class,
                MyImageShould.class })
public class SuiteForNonDb {

        //run all junit test

}
