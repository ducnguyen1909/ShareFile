package com.example.thien.airdroid;

import android.content.Context;

import java.io.Serializable;

/**
 * Created by Thien on 4/22/2017.
 */

public class Contact implements Serializable, Comparable<Contact>{
        private String name;
        private String phone;

        public Contact(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public int compareTo(Contact contact) {
            int compareName = this.name.compareTo(contact.name);
            return compareName;
        }
}
