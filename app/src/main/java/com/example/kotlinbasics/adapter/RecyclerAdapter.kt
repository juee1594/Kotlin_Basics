package com.example.kotlinbasics.adapter

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinbasics.R
import com.example.kotlinbasics.model.Data
import com.example.kotlinbasics.view.SampleRoomDbActivity
import com.example.kotlinbasics.view.ViewModelExample

class RecyclerAdapter(val list: ArrayList<Data>, val context: Context) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val tv_emp_id: TextView = itemview.findViewById(R.id.tv_emp_id)
        val tv_emp_name: TextView = itemview.findViewById(R.id.tv_emp_name)
        val tv_emp_salary: TextView = itemview.findViewById(R.id.tv_emp_salary)
        val tv_emp_age: TextView = itemview.findViewById(R.id.tv_emp_age)
        val img_edit: ImageView = itemview.findViewById(R.id.img_edit)
        val linearLayout: LinearLayout = itemview.findViewById(R.id.linearLayout)
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

            img_edit.setOnClickListener(){

                val intent = Intent(context, SampleRoomDbActivity::class.java)
                context.startActivity(intent)
//                dialogWithEdit(itemView)
            }

            linearLayout.setOnClickListener({
                val intent = Intent(context, ViewModelExample::class.java)
                context.startActivity(intent)
            })
        }
    }

    fun dialogWithEdit(view: View){
        val alertDialogBuilder = AlertDialog.Builder(context)
        val dialogLayout = LayoutInflater.from(context).inflate(R.layout.alert_dialog_update_emp_details, null)

        val edt_name: EditText = dialogLayout.findViewById(R.id.edt_name)
        val edt_salary: EditText = dialogLayout.findViewById(R.id.edt_salary)

        alertDialogBuilder.setView(dialogLayout)
        alertDialogBuilder.setPositiveButton("Update") {
            alertDialogBuilder, i ->
            Toast.makeText(context, "Edittext is ${edt_name.text}", Toast.LENGTH_SHORT).show()
        }
        alertDialogBuilder.show()
    }
}