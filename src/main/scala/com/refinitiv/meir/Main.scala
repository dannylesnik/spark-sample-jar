package com.refinitiv.meir

import org.apache.spark.{SparkConf, SparkContext}

object Main {
  private val data = Seq("aaa", "bbb", "ccc", "ddd", "aaa", "zzz")

  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("Meir's simple application")

    val sc = new SparkContext(conf)

    val rddData = sc.parallelize(data)
    val numAs = rddData.filter(line => line.contains("a")).count
    val numBs = rddData.filter(line => line.contains("b")).count

    println("***************************************************************")
    println("************* Lines with a: %s, Lines with b: %s *************".format(numAs, numBs))
    println("***************************************************************")
  }
}
