package com.example.kotlinbasics

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val list: ArrayList<Data>, val context: Context) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val tv_emp_id: TextView = itemview.findViewById(R.id.tv_emp_id)
        val tv_emp_name: TextView = itemview.findViewById(R.id.tv_emp_name)
        val tv_emp_salary: TextView = itemview.findViewById(R.id.tv_emp_salary)
        val tv_emp_age: TextView = itemview.findViewById(R.id.tv_emp_age)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.design_layout, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = list[position]
        holder.apply {
            tv_emp_id.text = "Emp ID: ${currentItem.id}"
            tv_emp_name.text = "Emp Name: ${currentItem.employee_name}"
            tv_emp_salary.text = "Emp Salary: ${currentItem.employee_salary}"
            tv_emp_age.text = "Emp Age: ${currentItem.employee_age}"

        }
    }
}